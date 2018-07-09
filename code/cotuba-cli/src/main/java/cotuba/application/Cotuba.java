package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;

public class Cotuba {
	
	public void executa(Path diretorioDosMD, Path arquivoDeSaida, String formato) {
		
		Livro livro = new Livro(formato, arquivoDeSaida);

		IRenderizadorMD renderizadorMD = IRenderizadorMD.cria();
		List<Capitulo> capitulos = renderizadorMD.renderiza(diretorioDosMD);
		
		livro.adicionaCapitulos(capitulos);
		
		if ("pdf".equals(formato)) {
			
			IGeradorPDF geradorPDF = IGeradorPDF.cria();
			geradorPDF.gera(livro);

		} else if ("epub".equals(formato)) {
			
			IGeradorEPUB geradorEPUB = IGeradorEPUB.cria();;
			geradorEPUB.gera(livro);
			
		} else {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}

	}

}
