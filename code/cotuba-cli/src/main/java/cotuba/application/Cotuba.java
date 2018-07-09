package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUBComEpubLib;
import cotuba.pdf.GeradorPDFComIText;

public class Cotuba {
	
	public void executa(Path diretorioDosMD, Path arquivoDeSaida, String formato) {
		
		Livro livro = new Livro(formato, arquivoDeSaida);

		RenderizadorMD renderizadorMD = RenderizadorMD.cria();
		List<Capitulo> capitulos = renderizadorMD.renderiza(diretorioDosMD);
		
		livro.adicionaCapitulos(capitulos);
		
		GeradorLivro geradorLivro;

		if ("pdf".equals(formato)) {
			geradorLivro = new GeradorPDFComIText();
		} else if ("epub".equals(formato)) {
			geradorLivro = new GeradorEPUBComEpubLib();
		} else {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}

		geradorLivro.gera(livro);

	}

}
