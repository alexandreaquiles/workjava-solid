package cotuba.domain;

import cotuba.application.GeradorLivro;
import cotuba.epub.GeradorEPUB;
import cotuba.pdf.GeradorPDF;

public enum FormatoLivro {

	PDF(new GeradorPDF()),
	EPUB(new GeradorEPUB());
	
	private GeradorLivro gerador;

	private FormatoLivro(GeradorLivro gerador) {
		this.gerador = gerador;
	}
	
	public GeradorLivro getGerador() {
		return gerador;
	}
	
}
