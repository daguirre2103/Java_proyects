package practica7_Ej18;

import java.util.*;

public class Estanterias {

	private HashMap <Integer, HashMap<Integer, Libro>> ests;
	
		
	public Estanterias(HashMap<Integer, HashMap<Integer, Libro>> ests) {
		super();
		this.ests = ests;
	}

	
	public HashMap<Integer, HashMap<Integer, Libro>> getEsts() {
		return ests;
	}

	public void setEsts(HashMap<Integer, HashMap<Integer, Libro>> ests) {
		this.ests = ests;
	}


		
	public void agregarEstante (HashMap<Integer, Libro>  est, HashMap<Integer, HashMap<Integer, Libro>> ests) {
		
		ests.put(1, est);
		
	}
	
	public void MostrarEstante (HashMap <Integer, HashMap <Integer, Libro>> ests) {
		
		Iterator it = ests.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Libro> e = (Map.Entry<Integer, Libro>)it.next();
			System.out.println((e.getKey() + "" + e.getValue()));
			
			
			
		}
	}
	
	public void BuscarLibro (HashMap <Integer, HashMap <Integer, Libro>> ests, Libro libro) {
		
		
	}
}
