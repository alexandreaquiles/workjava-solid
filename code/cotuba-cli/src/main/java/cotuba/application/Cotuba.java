package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUB;
import cotuba.md.RenderizadorMD;
import cotuba.pdf.GeradorPDF;

public class Cotuba {
	
	public void executa(Path diretorioDosMD, Path arquivoDeSaida, String formato) {
		
		Livro livro = new Livro(formato, arquivoDeSaida);

		RenderizadorMD renderizadorMD = new RenderizadorMD();
		List<Capitulo> capitulos = renderizadorMD.renderiza(diretorioDosMD);
		
		livro.adicionaCapitulos(capitulos);
		
		if ("pdf".equals(formato)) {
			
			GeradorPDF geradorPDF = new GeradorPDF();
			geradorPDF.gera(livro);

		} else if ("epub".equals(formato)) {
			
			GeradorEPUB geradorEPUB = new GeradorEPUB();
			geradorEPUB.gera(livro);
			
		} else {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}

	}

}
