package cotuba.pdf;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.IElement;
import com.itextpdf.layout.property.AreaBreakType;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;

public class GeradorPDF implements IGeradorPDF {
	
	@Override
	public void gera(Livro livro) {
		Path arquivoDeSaida = livro.getArquivoDeSaida();

		try {
			
			PdfWriter writer = new PdfWriter(Files.newOutputStream(arquivoDeSaida));
			PdfDocument pdf = new PdfDocument(writer);
			Document pdfDocument = new Document(pdf);
			
			for (Capitulo capitulo : livro.getCapitulos()) {

				String conteudoHTML = capitulo.getConteudoHTML();
				
				List<IElement> convertToElements = HtmlConverter.convertToElements(conteudoHTML);
				for (IElement element : convertToElements) {
					pdfDocument.add((IBlockElement) element);
				}

				if (!capitulo.equals(livro.ultimoCapitulo())) {
					pdfDocument.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
				}
				
			}

			pdfDocument.close();
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao criar arquivo PDF: " + arquivoDeSaida.toAbsolutePath(), ex);
		}

	}

}
