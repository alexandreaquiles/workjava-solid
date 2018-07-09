package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.FormatoLivro;
import cotuba.domain.Livro;
import cotuba.estatisticas.CalculadoraEstatisticasLivro;
import cotuba.plugin.GerouLivro;

public class Cotuba {
	
	public void executa(Path diretorioDosMD, Path arquivoDeSaida, FormatoLivro formato, boolean calcularEstatisticas) {
		
		Livro livro = new Livro(formato, arquivoDeSaida);

		RenderizadorMD renderizadorMD = RenderizadorMD.cria();
		List<Capitulo> capitulos = renderizadorMD.renderiza(diretorioDosMD);
		
		livro.adicionaCapitulos(capitulos);
		
		GeradorLivro geradorLivro = formato.getGerador();

		geradorLivro.gera(livro);
		
		GerouLivro.executa(livro);
		
		if (calcularEstatisticas) {
			CalculadoraEstatisticasLivro calculadoraEstatisticas = new CalculadoraEstatisticasLivro();
			calculadoraEstatisticas.contaPalavras(livro);
		}

	}

}
