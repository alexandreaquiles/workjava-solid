package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.FormatoLivro;
import cotuba.domain.Livro;
import cotuba.estatisticas.CalculadoraEstatisticasLivro;
import cotuba.estatisticas.ContagemPalavras;
import cotuba.plugin.GeradorLivro;
import cotuba.plugin.GerouLivro;

public class Cotuba {
	
	private ContagemPalavras contagemPalavras;

	public void executa(Path diretorioDosMD, Path arquivoDeSaida, FormatoLivro formato, boolean calcularEstatisticas) {
		
		Livro livro = new Livro(formato, arquivoDeSaida);

		RenderizadorMD renderizadorMD = RenderizadorMD.cria();
		List<Capitulo> capitulos = renderizadorMD.renderiza(diretorioDosMD);
		
		livro.adicionaCapitulos(capitulos);
		
		GeradorLivro geradorLivro = GeradorLivro.cria(formato);

		geradorLivro.gera(livro);
		
		GerouLivro.executa(livro);
		
		if (calcularEstatisticas) {
			CalculadoraEstatisticasLivro calculadoraEstatisticas = new CalculadoraEstatisticasLivro();
			contagemPalavras = calculadoraEstatisticas.contaPalavras(livro);
		}
	}

	public ContagemPalavras getContagemPalavras() {
		return contagemPalavras;
	}
}
