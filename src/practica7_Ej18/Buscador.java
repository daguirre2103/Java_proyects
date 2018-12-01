package practica7_Ej18;

import java.util.Map;


public class Buscador {
	
	

	public Trio<Integer, Integer, Libro> BuscarLibro (Estante e, Integer n, String m) {
		
		Libro l = null;
		Integer n1 = null;
		Integer n2 = null;
		Trio<Integer, Integer, Libro> trio = new Trio<Integer, Integer, Libro>(n1, n2, l);
		
		for (Map.Entry<Integer, Libro> est: e.libros.entrySet()) {
			if (est.getValue().getNombre().equals(m)) {
				l = est.getValue();
				n2 = est.getKey();
			}
		}
		
		trio.setPrimero(n);
		trio.setSegundo(n2);
		trio.setTercero(l);
		return trio;
	}
	
	public void Buscar (Estanterias ests, String m) {
		Trio<Integer, Integer, Libro> trio = null; 
				
		for (Map.Entry<Integer, Estante> e: ests.ests.entrySet()) {
			trio = this.BuscarLibro(e.getValue(), e.getKey(), m);
						
		}
		if (trio.getTercero() != null) {
			System.out.println("Nro Estante: " + trio.getPrimero() + "Id libro: " + trio.getSegundo() + "Titulo libro: " + trio.getTercero().getNombre());
		}else {
			System.out.println("libro no encontrado");
		}
		
		
		
	}
}
