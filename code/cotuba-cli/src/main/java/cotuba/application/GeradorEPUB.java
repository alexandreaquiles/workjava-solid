package cotuba.application;

import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUBImpl;

public interface GeradorEPUB {

	void gera(Livro livro);

	static GeradorEPUB cria() {
		return new GeradorEPUBImpl();
	}

}