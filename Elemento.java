package parcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Elemento {
	protected String nombre;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract ArrayList<Elemento> elementosCon(Criterio filtro);
	public abstract double getPrecio();
	public abstract ArrayList<String> getCategorias();
	public abstract double getPeso();
	public abstract int getCantidad();
	public abstract Elemento getCopy(Criterio filtro);

	
	public ArrayList<Elemento> elementosCon(Criterio filtro, Comparator<Elemento> comparador){
		ArrayList<Elemento> aux = this.elementosCon(filtro);
		Collections.sort(aux, comparador);
		return aux;
	}

	public String getNombre() {
		return this.nombre;
		
	}
}
