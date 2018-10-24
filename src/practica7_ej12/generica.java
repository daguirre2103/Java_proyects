package practica7_ej12;

public class generica<T> {
	T obj;
	public generica(T obj) {
		super();
		this.obj = obj;
	}
	
	public void TipoClase() {
		System.out.println("La clase es de tipo:"+ obj.getClass().getTypeName());
	}
	
	
}
