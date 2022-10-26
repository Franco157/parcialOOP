package parcial;

public class CriterioAnd extends Criterio {
	private Criterio c1;
	private Criterio c2;
	
	public CriterioAnd(Criterio criterioUno, Criterio criterioDos) {
		this.c1 = criterioUno;
		this.c2 = criterioDos;
	}

	@Override
	public boolean cumple(Elemento e1) {
		// TODO Auto-generated method stub
		return c1.cumple(e1) && c2.cumple(e1);
	}

}
