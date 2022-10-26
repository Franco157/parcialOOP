package parcial;

public class CriterioPeso extends Criterio {
	private double peso;
	
	public CriterioPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public boolean cumple(Elemento e1) {
		// TODO Auto-generated method stub
		return e1.getPeso() > this.peso;
	}

}
