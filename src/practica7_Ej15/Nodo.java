package practica7_Ej15;

public class Nodo<T> {
	
	private Nodo<T> raiz;
	private T valor;
	private Nodo<T> aizq;
	private Nodo<T> ader;
	
	public Nodo(Nodo<T> raiz, T valor, Nodo<T> aizq, Nodo<T> ader) {
		super();
		this.raiz = raiz;
		this.valor = valor;
		this.aizq = aizq;
		this.ader = ader;
	}

	public Nodo<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Nodo<T> getAizq() {
		return aizq;
	}

	public void setAizq(Nodo<T> aizq) {
		this.aizq = aizq;
	}

	public Nodo<T> getAder() {
		return ader;
	}

	public void setAder(Nodo<T> ader) {
		this.ader = ader;
	}
	
	public boolean Buscar (Nodo<T> a, T valor) {
		
		boolean rta;
		
		if (a.getRaiz().getValor() == valor) {
			rta = true;
			return rta;
		}else {
			return a.Buscar(a.getAizq(), valor)	|| a.Buscar(a.getAizq(), valor);
		}
	}
	
}
