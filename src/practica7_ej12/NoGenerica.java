package practica7_ej12;

public class NoGenerica {
	int t;

	public NoGenerica(int t) {
		super();
		this.t = t;
	}
	
	public void TipoClase() {
		System.out.println("El elemento es de tipo:"+ this.getClass().getTypeName());
	}
}
