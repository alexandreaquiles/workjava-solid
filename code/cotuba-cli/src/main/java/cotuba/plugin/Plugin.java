package cotuba.plugin;

import java.util.ServiceLoader;

import cotuba.domain.Capitulo;
import cotuba.domain.Livro;

public interface Plugin {
	
	void aposRenderizacaoMD(Capitulo capitulo);
	
	void aoFinalizarGeracao(Livro livro);

	static void renderizouMD(Capitulo capitulo) {
		ServiceLoader.load(Plugin.class).forEach(plugin -> plugin.aposRenderizacaoMD(capitulo));
	}

	static void gerou(Livro livro) {
		ServiceLoader.load(Plugin.class).forEach(plugin -> plugin.aoFinalizarGeracao(livro));
	}

}
