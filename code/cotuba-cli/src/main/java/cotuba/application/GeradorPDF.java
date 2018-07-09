package cotuba.application;

import cotuba.domain.Livro;
import cotuba.pdf.GeradorPDFImpl;

public interface GeradorPDF {

	void gera(Livro livro);

	static GeradorPDF cria() {
		return new GeradorPDFImpl();
	}
	
}