package practica7_Ej15;

public class ArbolH<T, H> {
	
	private Nodo<T> T;
	private Hoja<H> H;
	
	public ArbolH(Nodo<T> t, Hoja<H> h) {
		super();
		T = t;
		H = h;
	}

	public Nodo<T> getT() {
		return T;
	}

	public void setT(Nodo<T> t) {
		T = t;
	}

	public Hoja<H> getH() {
		return H;
	}

	public void setH(Hoja<H> h) {
		H = h;
	}
	
	
}
