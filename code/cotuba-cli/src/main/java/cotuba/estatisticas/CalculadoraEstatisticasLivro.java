package cotuba.estatisticas;

import java.util.HashMap;
import java.util.Map;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;

public class CalculadoraEstatisticasLivro {

	public void contaPalavras(Livro livro) {

		Map<String, Integer> contagem = new HashMap<>();
		
		for (Capitulo capitulo : livro.getCapitulos()) {
			String conteudoHTML = capitulo.getConteudoHTML();
			contagem.put(conteudoHTML, 1); //está certo???
		}
	}

}
