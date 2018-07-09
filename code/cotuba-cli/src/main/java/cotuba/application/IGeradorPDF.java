package cotuba.application;

import cotuba.domain.Livro;
import cotuba.pdf.GeradorPDF;

public interface IGeradorPDF {

	void gera(Livro livro);

	static IGeradorPDF cria() {
		return new GeradorPDF();
	}
	
}