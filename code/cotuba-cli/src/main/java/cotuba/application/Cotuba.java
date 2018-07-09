package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;

public class Cotuba {
	
	public void executa(Path diretorioDosMD, Path arquivoDeSaida, String formato) {
		
		Livro livro = new Livro(formato, arquivoDeSaida);

		RenderizadorMD renderizadorMD = RenderizadorMD.cria();
		List<Capitulo> capitulos = renderizadorMD.renderiza(diretorioDosMD);
		
		livro.adicionaCapitulos(capitulos);
		
		GeradorLivro geradorLivro = GeradorLivro.cria(formato);

		geradorLivro.gera(livro);

	}

}
