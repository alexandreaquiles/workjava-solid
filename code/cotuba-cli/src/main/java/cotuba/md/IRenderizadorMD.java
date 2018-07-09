package cotuba.md;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;

public interface IRenderizadorMD {

	List<Capitulo> renderiza(Path diretorioDosMD);

}