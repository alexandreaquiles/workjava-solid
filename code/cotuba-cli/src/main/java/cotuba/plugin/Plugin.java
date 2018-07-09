package cotuba.plugin;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;

public interface Plugin {
	
	void aposRenderizacaoMD(Capitulo capitulo);
	
	void aoFinalizarGeracao(Livro livro);

}
