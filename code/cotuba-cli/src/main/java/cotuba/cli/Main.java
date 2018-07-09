package cotuba.cli;

import java.nio.file.Path;

import cotuba.application.Cotuba;
import cotuba.domain.FormatoLivro;

public class Main {

	public static void main(String[] args) {
		
		boolean modoVerboso = false;
		
		try {

			LeitorOpcoesCLI leitorCLI = new LeitorOpcoesCLI();
			leitorCLI.le(args);
	
			Path diretorioDosMD = leitorCLI.getDiretorioDosMD();
			FormatoLivro formato = leitorCLI.getFormato();
			Path arquivoDeSaida = leitorCLI.getArquivoDeSaida();
			modoVerboso = leitorCLI.isModoVerboso();
			boolean calcularEstatisticas = leitorCLI.isCalcularEstatisticas();
			
			Cotuba cotuba = new Cotuba();
			cotuba.executa(diretorioDosMD, arquivoDeSaida, formato, calcularEstatisticas);
	
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
