package cotuba.estatisticas;

import com.itextpdf.html2pdf.jsoup.Jsoup;
import com.itextpdf.html2pdf.jsoup.nodes.Document;

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
				contagem.adicionaPalavra(palavra);
			}
		}
		
		return contagem;
	}

}
