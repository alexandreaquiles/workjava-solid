package cotuba;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.stream.Stream;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Heading;
import org.commonmark.node.Node;
import org.commonmark.node.Text;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.epub.EpubWriter;
import nl.siegmann.epublib.service.MediatypeService;

public class Main {

	public static void main(String[] args) {
		
		LeitorOpcoesCLI leitorCLI = new LeitorOpcoesCLI();
		leitorCLI.le(args);

		Path diretorioDosMD = leitorCLI.getDiretorioDosMD();
		String formato = leitorCLI.getFormato();
		Path arquivoDeSaida = leitorCLI.getArquivoDeSaida();
		boolean modoVerboso = leitorCLI.isModoVerboso();

		try {

			
			if ("pdf".equals(formato)) {
				
				GeradorPDF geradorPDF = new GeradorPDF();
				geradorPDF.gera(diretorioDosMD, arquivoDeSaida);

			} else if ("epub".equals(formato)) {
				Book epub = new Book();

				PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*.md");
				Stream<Path> arquivosMD = Stream.empty();
				try {
					arquivosMD = Files.list(diretorioDosMD).filter(arquivo -> matcher.matches(arquivo)).sorted();
				} catch (IOException ex) {
					throw new RuntimeException(
							"Erro tentando encontrar arquivos .md em " + diretorioDosMD.toAbsolutePath(), ex);
				}

				arquivosMD.forEach(arquivoMD -> {
					Parser parser = Parser.builder().build();
					Node document = null;
					try {
						document = parser.parseReader(Files.newBufferedReader(arquivoMD));
						document.accept(new AbstractVisitor() {
							public void visit(Heading heading) {
								if (heading.getLevel() == 1) {
									// capítulo
									String tituloDoCapitulo = ((Text) heading.getFirstChild()).getLiteral();
									// TODO: usar título do capítulo
								} else if (heading.getLevel() == 2) {
									// seção
								} else if (heading.getLevel() == 3) {
									// título
								}
							}

						});
					} catch (Exception ex) {
						throw new RuntimeException("Error parsing file " + arquivoMD, ex);
					}

					try {
						HtmlRenderer renderer = HtmlRenderer.builder().build();
						String html = renderer.render(document);

						// TODO: usar título do capítulo
						epub.addSection("Capítulo", new Resource(html.getBytes(), MediatypeService.XHTML));

					} catch (Exception ex) {
						throw new RuntimeException("Erro ao renderizar para HTML o arquivo " + arquivoMD, ex);
					}
				});

				EpubWriter epubWriter = new EpubWriter();

				try {
					epubWriter.write(epub, Files.newOutputStream(arquivoDeSaida));
				} catch (IOException ex) {
					throw new RuntimeException("Erro ao criar arquivo EPUB: " + arquivoDeSaida.toAbsolutePath(), ex);
				}
			} else {
				throw new RuntimeException("Formato do ebook inválido: " + formato);
			}

			System.out.println("Arquivo gerado com sucesso: " + arquivoDeSaida);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			if (modoVerboso) {
				ex.printStackTrace();
			}
			System.exit(1);
		}
	}

}