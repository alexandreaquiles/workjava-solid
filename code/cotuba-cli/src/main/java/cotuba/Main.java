package cotuba;

import java.nio.file.Path;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		LeitorOpcoesCLI leitorCLI = new LeitorOpcoesCLI();
		leitorCLI.le(args);

		Path diretorioDosMD = leitorCLI.getDiretorioDosMD();
		String formato = leitorCLI.getFormato();
		Path arquivoDeSaida = leitorCLI.getArquivoDeSaida();
		boolean modoVerboso = leitorCLI.isModoVerboso();

		try {
			
			Livro livro = new Livro(formato, arquivoDeSaida);

			RenderizadorMD renderizadorMD = new RenderizadorMD();
			List<Capitulo> capitulos = renderizadorMD.renderiza(diretorioDosMD);
			
			livro.adicionaCapitulos(capitulos);
			
			if ("pdf".equals(formato)) {
				
				GeradorPDF geradorPDF = new GeradorPDF();
				geradorPDF.gera(livro);

			} else if ("epub".equals(formato)) {
				
				GeradorEPUB geradorEPUB = new GeradorEPUB();
				geradorEPUB.gera(livro);
				
			} else {
				throw new RuntimeException("Formato do ebook inválido: " + formato);
			}

			System.out.println("Arquivo gerado com sucesso: " + arquivoDeSaida);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			if (modoVerboso) {
				ex.printStackTrace();
			}
			System.exit(1);
		}
	}

}
