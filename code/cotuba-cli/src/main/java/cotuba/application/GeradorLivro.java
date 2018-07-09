package cotuba.application;

import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUB;
import cotuba.pdf.GeradorPDF;

public interface GeradorLivro {

	void gera(Livro livro);
	
	static GeradorLivro cria(String formato) {
		GeradorLivro geradorLivro;
		
		if ("pdf".equals(formato)) {
		
			geradorLivro = new GeradorPDF();
		
		} else if ("epub".equals(formato)) {
		
			geradorLivro = new GeradorEPUB();
		
		} else {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}
		
		return geradorLivro;
	}
	
}
