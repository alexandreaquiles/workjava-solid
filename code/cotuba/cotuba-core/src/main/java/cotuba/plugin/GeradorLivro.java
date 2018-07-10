package cotuba.plugin;

import java.util.ServiceLoader;
import java.util.Spliterator;
import java.util.stream.StreamSupport;

import cotuba.domain.FormatoLivro;
import cotuba.domain.Livro;

public interface GeradorLivro {
	
	void gera(Livro livro);
	
	FormatoLivro formato();
	
	static GeradorLivro cria(FormatoLivro formato) {
		Spliterator<GeradorLivro> spliterator = ServiceLoader.load(GeradorLivro.class).spliterator();
		return StreamSupport.stream(spliterator, false)
				.filter(gerador -> gerador.formato().equals(formato))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Não há um gerador para o formato " + formato));
	}
	
}
