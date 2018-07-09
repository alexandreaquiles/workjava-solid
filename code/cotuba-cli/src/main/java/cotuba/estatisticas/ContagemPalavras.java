package cotuba.estatisticas;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ContagemPalavras implements Iterable<ContagemPalavras.Contagem> {

	private Map<String, Integer> map = new TreeMap<String, Integer>();
	
	public class Contagem {
		private final String palavra;
		private final Integer quantidade;
		
		public Contagem(String palavra, Integer quantidade) {
			this.palavra = palavra;
			this.quantidade = quantidade;
		}
		
		public String getPalavra() {
			return palavra;
		}
		
		public Integer getQuantidade() {
			return quantidade;
		}
	}
	
	public void adicionaPalavra(String palavra) {
		Integer contagem = map.get(palavra);
		
		if (contagem != null) {
			contagem++;
		} else {
			contagem = 1;
		}
		
		map.put(palavra, contagem);
	}

	@Override
	public Iterator<Contagem> iterator() {
		Iterator<Map.Entry<String, Integer>> interno = map.entrySet().iterator();
		
		return new Iterator<ContagemPalavras.Contagem>() {

			@Override
			public boolean hasNext() {
				return interno.hasNext();
			}

			@Override
			public Contagem next() {
				Map.Entry<String, Integer> item = interno.next();
				return new Contagem(item.getKey(), item.getValue());
			}
			
		};
	}

}
