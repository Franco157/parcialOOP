package parcial;

public class ComboPromocion extends Combo {

	public ComboPromocion(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecio() {
		double total = 0;
		for (Elemento prod : getProductos()) {
			total+= prod.getPrecio();
		}
		return total/getCantidad();
		
	}
}
