package practica7_ej12;

public class ProgramaEj12 {

	public static void main(String[] args) {
		 // Creamos una instancia de Generica para Integer.
	    generica<Integer> intObj = new generica<Integer>(88);
	    intObj.TipoClase();
	 
	    // Creamos una instancia de ClaseGenerica para String.
	    generica<String> strObj = new generica<String>("Test");
	    strObj.TipoClase();
	    
	    NoGenerica Obj = new NoGenerica(88);
	    Obj.TipoClase();

	}

}
