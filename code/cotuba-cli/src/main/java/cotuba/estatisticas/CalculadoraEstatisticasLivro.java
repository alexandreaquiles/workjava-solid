package cotuba.estatisticas;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;

public class CalculadoraEstatisticasLivro {

	public ContagemPalavras contaPalavras(Livro livro) {

		ContagemPalavras contagem = new ContagemPalavras();
		
		for (Capitulo capitulo : livro.getCapitulos()) {
			String conteudoHTML = capitulo.getConteudoHTML();
			contagem.adicionaPalavra(conteudoHTML);
		}
		
		return contagem;
	}

}
