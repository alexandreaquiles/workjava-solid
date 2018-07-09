package cotuba.application;

import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUBComEpubLib;

public interface GeradorEPUB {

	void gera(Livro livro);

	static GeradorEPUB cria() {
		return new GeradorEPUBComEpubLib();
	}

}