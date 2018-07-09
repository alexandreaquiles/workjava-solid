package cotuba;

import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		
		boolean modoVerboso = false;
		
		try {

			LeitorOpcoesCLI leitorCLI = new LeitorOpcoesCLI();
			leitorCLI.le(args);
	
			Path diretorioDosMD = leitorCLI.getDiretorioDosMD();
			String formato = leitorCLI.getFormato();
			Path arquivoDeSaida = leitorCLI.getArquivoDeSaida();
			modoVerboso = leitorCLI.isModoVerboso();
	
			Cotuba cotuba = new Cotuba();
			cotuba.executa(diretorioDosMD, arquivoDeSaida, formato);
	
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
