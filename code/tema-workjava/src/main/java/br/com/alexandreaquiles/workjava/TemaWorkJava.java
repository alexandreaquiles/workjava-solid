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

		try {
			String html = capitulo.getConteudoHTML();
			Document document = Jsoup.parse(html);

			String css = FileUtils.getResourceContents("/tema.css");

			document.select("head").append("<style> " + css + " </style>");
			
			capitulo.setConteudoHTML(document.html());
		} catch (Exception e) {
			throw new RuntimeException("Erro ao ler CSS do tema WorkJava", e);
		}
		
	}

	@Override
	public void aoFinalizarGeracao(Livro livro) {

	}

}
