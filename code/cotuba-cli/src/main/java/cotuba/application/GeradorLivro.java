package cotuba.application;

import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUBComEpubLib;
import cotuba.pdf.GeradorPDFComIText;

public interface GeradorLivro {

	void gera(Livro livro);
	
	static GeradorLivro cria(String formato) {
		GeradorLivro geradorLivro;
		
		if ("pdf".equals(formato)) {
		
			geradorLivro = new GeradorPDFComIText();
		
		} else if ("epub".equals(formato)) {
		
			geradorLivro = new GeradorEPUBComEpubLib();
		
		} else {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}
		
		return geradorLivro;
	}
	
}
