package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.md.RenderizadorMDComCommonMark;

public interface RenderizadorMD {

	List<Capitulo> renderiza(Path diretorioDosMD);
	
	static RenderizadorMD cria() {
		return new RenderizadorMDComCommonMark();
	}

}