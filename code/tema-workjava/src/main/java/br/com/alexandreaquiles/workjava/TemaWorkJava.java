package br.com.alexandreaquiles.workjava;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;
import cotuba.plugin.Plugin;

public class TemaWorkJava implements Plugin {

	@Override
	public void aposRenderizacaoMD(Capitulo capitulo) {
		System.out.println("Executando tema WorkJava para o capítulo: " + capitulo.getTitulo());
		
		String html = capitulo.getConteudoHTML();
		Document document = Jsoup.parse(html);
		document.select("head").append("<style>h1 { border: 1px dashed black; }</style>");
		
		capitulo.setConteudoHTML(document.html());
	}

	@Override
	public void aoFinalizarGeracao(Livro livro) {

	}

}
