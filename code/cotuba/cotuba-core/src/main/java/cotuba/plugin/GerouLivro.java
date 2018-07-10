package cotuba.plugin;

import java.util.ServiceLoader;

import cotuba.domain.Livro;

public interface GerouLivro {

	void aoFinalizarGeracao(Livro livro);

	static void executa(Livro livro) {
		ServiceLoader.load(GerouLivro.class).forEach(plugin -> plugin.aoFinalizarGeracao(livro));
	}

}
