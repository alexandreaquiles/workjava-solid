package cotuba.application;

import java.util.HashMap;
import java.util.Map;

import cotuba.domain.Livro;
import cotuba.epub.GeradorEPUB;
import cotuba.pdf.GeradorPDF;

public interface GeradorLivro {
	
	Map<String, GeradorLivro> geradores = new HashMap<String, GeradorLivro>() {{
		put("pdf", new GeradorPDF());
		put("epub", new GeradorEPUB());
	}};

	void gera(Livro livro);
	
	static GeradorLivro cria(String formato) {
		GeradorLivro geradorLivro = geradores.get(formato);
		
		if (geradorLivro == null) {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}
		
		return geradorLivro;
	}
	
}
