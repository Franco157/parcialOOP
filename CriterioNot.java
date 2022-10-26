package parcial;

public class CriterioNot extends Criterio {
	private Criterio c1;
	
	public CriterioNot(Criterio criterio) {
		this.c1 = criterio;
	}

	@Override
	public boolean cumple(Elemento e1) {
		// TODO Auto-generated method stub
		return !c1.cumple(e1);
	}

}
