package cotuba.application;

import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUB;

public interface IGeradorEPUB {

	void gera(Livro livro);

	static IGeradorEPUB cria() {
		return new GeradorEPUB();
	}

}