package parcial;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Elemento> {

	public ComparadorPrecio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Elemento o1, Elemento o2) {
		if(o1.getPrecio() > o2.getPrecio())
			return 1;
		else if(o1.getPrecio() < o2.getPrecio())
			return -1;
		
		return 0;
	}

}
