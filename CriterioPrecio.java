package parcial;

public class CriterioPrecio extends Criterio {
	private double precio;
	
	public CriterioPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public boolean cumple(Elemento e1) {
		// TODO Auto-generated method stub
		return e1.getPrecio() < this.precio;
	}

}
