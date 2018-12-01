package practica7_Ej18;

public class Trio <A, B, C> {
	private A primero;
	private B segundo;
	private C tercero;
	
	public Trio(A primero, B segundo, C tercero) {
		super();
		this.primero = primero;
		this.segundo = segundo;
		this.tercero = tercero;
	}
	public A getPrimero() {
		return primero;
	}
	public void setPrimero(A primero) {
		this.primero = primero;
	}
	public B getSegundo() {
		return segundo;
	}
	public void setSegundo(B segundo) {
		this.segundo = segundo;
	}
	public C getTercero() {
		return tercero;
	}
	public void setTercero(C tercero) {
		this.tercero = tercero;
	}
	
	
	
	
	
	
	
	
	
	
}
