package cotuba.application;

import cotuba.domain.Livro;
import cotuba.pdf.GeradorPDFComIText;

public interface GeradorPDF {

	void gera(Livro livro);

	static GeradorPDF cria() {
		return new GeradorPDFComIText();
	}
	
}