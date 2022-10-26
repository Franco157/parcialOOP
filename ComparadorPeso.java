package parcial;

import java.util.Comparator;

public class ComparadorPeso implements Comparator<Elemento> {

	public ComparadorPeso() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Elemento o1, Elemento o2) {
		if(o1.getPeso() > o2.getPeso())
			return 1;
		else if(o1.getPeso() < o2.getPeso())
			return -1;
		return 0;
	}

}
