package cotuba.md;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import cotuba.domain.Capitulo;

public class RenderizadorMD {

	public List<Capitulo> renderiza(Path diretorioDosMD) {
		Stream<Path> arquivosMD = obtemArquivosMD(diretorioDosMD);
		
		List<Capitulo> capitulos = new ArrayList<>();

		arquivosMD.forEach(arquivoMD -> {
			
			Capitulo capitulo = new Capitulo();
			
			Node document = parseDoMD(arquivoMD, capitulo);

			renderizaParaHTML(arquivoMD, capitulo, document);
			
			capitulos.add(capitulo);
		});

		return capitulos;
	}

	private Stream<Path> obtemArquivosMD(Path diretorioDosMD) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*.md");
		Stream<Path> arquivosMD = Stream.empty();
		try {
			arquivosMD = Files.list(diretorioDosMD).filter(arquivo -> matcher.matches(arquivo)).sorted();
		} catch (IOException ex) {
			throw new RuntimeException(
					"Erro tentando encontrar arquivos .md em " + diretorioDosMD.toAbsolutePath(), ex);
		}
		return arquivosMD;
	}

	private Node parseDoMD(Path arquivoMD, Capitulo capitulo) {
		Parser parser = Parser.builder().build();
		Node document = null;
		try {
			document = parser.parseReader(Files.newBufferedReader(arquivoMD));
			document.accept(new HeadingVisitor(capitulo));
		} catch (Exception ex) {
			throw new RuntimeException("Error parsing file " + arquivoMD, ex);
		}
		return document;
	}

	private void renderizaParaHTML(Path arquivoMD, Capitulo capitulo, Node document) {
		try {
			HtmlRenderer renderer = HtmlRenderer.builder().build();
			String html = renderer.render(document);
			
			capitulo.setConteudoHTML(html);
			
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao renderizar para HTML o arquivo " + arquivoMD, ex);
		}
	}

}
