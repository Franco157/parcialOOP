package parcial;

public class CriterioCategoria extends Criterio {
	private String categoria;
	
	public CriterioCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean cumple(Elemento e1) {
		// TODO Auto-generated method stub
		return e1.getCategorias().contains(this.categoria);
	}

}
