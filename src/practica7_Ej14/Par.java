package practica7_Ej14;

public class Par<A, B> {
	private A primero;
	private B segundo;
	
	public Par(A primero, B segundo) {
		super();
		this.primero = primero;
		this.segundo = segundo;
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
	
	
	
}
