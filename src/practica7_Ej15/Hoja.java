package practica7_Ej15;

public class Hoja<H> {
	
	private Hoja<H> raiz;
	private H valor;
	
	public Hoja(Hoja<H> raiz, H valor) {
		super();
		this.raiz = raiz;
		this.valor = valor;
	}

	public Hoja<H> getRaiz() {
		return raiz;
	}

	public void setRaiz(Hoja<H> raiz) {
		this.raiz = raiz;
	}

	public H getValor() {
		return valor;
	}

	public void setValor(H valor) {
		this.valor = valor;
	}
	
	
}
