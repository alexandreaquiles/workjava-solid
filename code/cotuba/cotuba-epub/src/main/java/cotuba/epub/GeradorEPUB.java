package cotuba.epub;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import cotuba.domain.Capitulo;
import cotuba.domain.FormatoLivro;
import cotuba.domain.Livro;
import cotuba.plugin.GeradorLivro;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.epub.EpubWriter;
import nl.siegmann.epublib.service.MediatypeService;

public class GeradorEPUB implements GeradorLivro {

	@Override
	public void gera(Livro livro) {
		Book epub = new Book();

		for (Capitulo capitulo : livro.getCapitulos()) {
			String titulo = capitulo.getTitulo();
			String conteudoHTML = capitulo.getConteudoHTML();
			
			epub.addSection(titulo, new Resource(conteudoHTML.getBytes(), MediatypeService.XHTML));
		}

		EpubWriter epubWriter = new EpubWriter();

		Path arquivoDeSaida = livro.getArquivoDeSaida();

		try {
			epubWriter.write(epub, Files.newOutputStream(arquivoDeSaida));
		} catch (IOException ex) {
			throw new RuntimeException("Erro ao criar arquivo EPUB: " + arquivoDeSaida.toAbsolutePath(), ex);
		}

	}
	
	@Override
	public FormatoLivro formato() {
		return FormatoLivro.EPUB;
	}

}
