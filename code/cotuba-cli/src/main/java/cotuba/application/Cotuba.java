package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUB;
import cotuba.epub.IGeradorEPUB;
import cotuba.md.IRenderizadorMD;
import cotuba.md.RenderizadorMD;
import cotuba.pdf.GeradorPDF;
import cotuba.pdf.IGeradorPDF;

public class Cotuba {
	
	public void executa(Path diretorioDosMD, Path arquivoDeSaida, String formato) {
		
		Livro livro = new Livro(formato, arquivoDeSaida);

		IRenderizadorMD renderizadorMD = new RenderizadorMD();
		List<Capitulo> capitulos = renderizadorMD.renderiza(diretorioDosMD);
		
		livro.adicionaCapitulos(capitulos);
		
		if ("pdf".equals(formato)) {
			
			IGeradorPDF geradorPDF = new GeradorPDF();
			geradorPDF.gera(livro);

		} else if ("epub".equals(formato)) {
			
			IGeradorEPUB geradorEPUB = new GeradorEPUB();
			geradorEPUB.gera(livro);
			
		} else {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}

	}

}
