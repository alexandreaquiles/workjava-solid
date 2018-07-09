package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.md.RenderizadorMD;

public interface IRenderizadorMD {

	List<Capitulo> renderiza(Path diretorioDosMD);
	
	static IRenderizadorMD cria() {
		return new RenderizadorMD();
	}

}