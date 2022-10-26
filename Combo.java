package parcial;

import java.util.ArrayList;

public class Combo extends Elemento {
	
	private ArrayList<Elemento> productos;
	private Criterio criterioAceptacion;
	private double descuento = 1.4;
	private double tope = 0.5;
	
	public Combo(String nombre) {
		super(nombre);
		this.productos = new ArrayList<>();
		
	}
	public int getCantidadProd() {
		return this.productos.size();
	}
	
	public Elemento getPesoMenor() {
		Elemento aux = null;
		double peso = Double.MAX_VALUE;
		for (Elemento prod : productos) {
			if(prod.getPeso()<peso) {
				aux = prod;
				peso = prod.getPeso();
			}
		}
		return aux;
	}


	@Override
	public ArrayList<Elemento> elementosCon(Criterio filtro) {
		ArrayList<Elemento> aux = new ArrayList<>();
		if(filtro.cumple(this)) {
			aux.add(this);
		} else {
			for (Elemento prod : aux) {
				aux.addAll(prod.elementosCon(filtro));
			}
		}
		return aux;
	}

	@Override
	public double getPrecio() {
		double total = 0;
		double desc = this.descuento * this.getCantidad();
		for (Elemento prod : productos) {
			total+= prod.getPrecio();
		}
		if(desc < this.tope)
			return total*desc;
		return total*this.tope;
		
	}

	@Override
	public ArrayList<String> getCategorias() {
		ArrayList<String> aux = new ArrayList<>();
		
		for (Elemento prod : productos) {
			for (String categ : prod.getCategorias()) {
				if(!aux.contains(categ))
					aux.add(categ);
			}
		}
		return aux;
	}

	@Override
	public double getPeso() {
		double aux = 0;
		for (Elemento prod : productos) {
			aux += prod.getPeso();
		}
		return aux;
	}
	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getTope() {
		return tope;
	}

	public void setTope(double tope) {
		this.tope = tope;
	}
	public void setCriterioAceptacion(Criterio criterio) {
		this.criterioAceptacion = criterio;
	}

	public void addProducto(Elemento producto) {
		if(this.criterioAceptacion == null)
			this.productos.add(producto);
		else if (this.criterioAceptacion.cumple(producto))
			this.productos.add(producto);
	}

	@Override
	public int getCantidad() {
		int aux = 0;
		for (Elemento prod : productos) {
			aux += prod.getCantidad();
		}
		return aux;
	}

	@Override
	public Elemento getCopy(Criterio filtro) {
		
		Combo aux = new Combo(this.getNombre());

		if(this.criterioAceptacion != null)
			aux.setCriterioAceptacion(this.criterioAceptacion);
		// devolver una copia del criterio para no dar acceso al objeto
		
		for (Elemento prod : productos) {
			if(prod.getCopy(filtro) != null)
				aux.addProducto(prod.getCopy(filtro));
		}
	
		if(aux.getCantidadProd() > 0)
			return aux;
		else 
			return null;
	}

	public ArrayList<Elemento> getProductos(){
		return new ArrayList<>(this.productos);
	}






}
