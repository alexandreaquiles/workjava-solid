package cotuba.estatisticas;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;

public class CalculadoraEstatisticasLivro {

	public ContagemPalavras contaPalavras(Livro livro) {

		ContagemPalavras contagem = new ContagemPalavras();
		
		for (Capitulo capitulo : livro.getCapitulos()) {
			String conteudoHTML = capitulo.getConteudoHTML();
			Document document = Jsoup.parse(conteudoHTML);
			String textoCapitulo = document.body().text();
			for (String palavra : textoCapitulo.split("\\s+")) {
				String palavrasSemPontuacao = palavra.trim().replaceAll("\\p{Punct}", "");
				if (!palavrasSemPontuacao.isEmpty()) {
					contagem.adicionaPalavra(palavrasSemPontuacao);
				}
			}
		}
		
		return contagem;
	}

}
