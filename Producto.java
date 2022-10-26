package parcial;

import java.util.ArrayList;

public class Producto extends Elemento {

	private double precio;
	private double peso;
	private ArrayList<String> categorias;
	
	public Producto(String nombre, double precio, double peso) {
		super(nombre);
		this.precio = precio;
		this.peso = peso;
		this.categorias = new ArrayList<>();
		
	}


	@Override
	public ArrayList<Elemento> elementosCon(Criterio filtro) {
		ArrayList<Elemento> aux = new ArrayList<>();
		if(filtro.cumple(this))
			aux.add(this);
		return aux;
	}
	
	@Override
	public double getPrecio() {
		return precio;
	}
	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public ArrayList<String> getCategorias(){
		return new ArrayList<>(this.categorias);
	}
	public void addCategoria(String categoria) {
		this.categorias.add(categoria);
	}

	@Override
	public int getCantidad() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Elemento getCopy(Criterio filtro) {
		if(filtro.cumple(this)) {
			Producto aux = new Producto(this.getNombre(), this.getPrecio(), this.getPeso());
			if(this.categorias.size() > 0) {
				for (String categ : this.getCategorias()) {
					aux.addCategoria(categ);
				}
			}
			return aux;
		}
		return null;
	}



}
