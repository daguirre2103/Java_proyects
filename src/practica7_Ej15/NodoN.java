package practica7_Ej15;

import java.util.ArrayList;
import java.util.List;

public class NodoN<T> {

	private Nodo<T> padre;
	private T valor;
	private List<NodoN<T>> hijos;
	public NodoN(Nodo<T> padre, T valor) {
		super();
		this.padre = padre;
		this.valor = valor;
		hijos = new ArrayList();
	}
	public Nodo<T> getPadre() {
		return padre;
	}
	public void setPadre(Nodo<T> padre) {
		this.padre = padre;
	}
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public List<NodoN<T>> getHijos() {
		return hijos;
	}
	public void setHijos(List<NodoN<T>> hijos) {
		this.hijos = hijos;
	}
	
	
	
	
}
