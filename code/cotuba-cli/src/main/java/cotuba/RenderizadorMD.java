package cotuba;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Heading;
import org.commonmark.node.Node;
import org.commonmark.node.Text;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class RenderizadorMD {

	public List<Capitulo> renderiza(Path diretorioDosMD) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*.md");
		Stream<Path> arquivosMD = Stream.empty();
		try {
			arquivosMD = Files.list(diretorioDosMD).filter(arquivo -> matcher.matches(arquivo)).sorted();
		} catch (IOException ex) {
			throw new RuntimeException(
					"Erro tentando encontrar arquivos .md em " + diretorioDosMD.toAbsolutePath(), ex);
		}
		
		List<Capitulo> capitulos = new ArrayList<>();

		arquivosMD.forEach(arquivoMD -> {
			
			Capitulo capitulo = new Capitulo();
			
			Parser parser = Parser.builder().build();
			Node document = null;
			try {
				document = parser.parseReader(Files.newBufferedReader(arquivoMD));
				document.accept(new AbstractVisitor() {
					public void visit(Heading heading) {
						if (heading.getLevel() == 1) {
							// capítulo
							String tituloDoCapitulo = ((Text) heading.getFirstChild()).getLiteral();

							capitulo.setTitulo(tituloDoCapitulo);

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
				
				capitulo.setConteudoHTML(html);
				
			} catch (Exception ex) {
				throw new RuntimeException("Erro ao renderizar para HTML o arquivo " + arquivoMD, ex);
			}
		});

		return capitulos;
	}
}
