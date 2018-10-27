package practica7_Ej18;

import java.util.*;

public class Estanterias {

	private int indice;
	private HashMap <Integer, HashMap<Integer, Libro>> ests;
	
	public Estanterias(){
		
	}
	
	public HashMap<Integer, HashMap<Integer, Libro>> ConstEstanterias(int indice, ArrayList<HashMap<Integer, Libro>> ests) {
		
		HashMap<Integer, HashMap<Integer, Libro>> estanteria = new HashMap<Integer, HashMap<Integer, Libro>>();
		
		for (HashMap<Integer, Libro> estAux: ests) {
			estanteria.put(indice++, estAux);
		}
		
		return estanteria;
	}

	public HashMap<Integer, HashMap<Integer, Libro>> AgregarEstante (int indice, HashMap<Integer, Libro> est, HashMap<Integer, HashMap<Integer, Libro>> estss){
		
		estss.put(indice, est);
		return estss;
	}
	public void MostrarEstante (HashMap <Integer, HashMap <Integer, Libro>> ests) {
		
		Iterator it = ests.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, HashMap <Integer, Libro>> e = (Map.Entry<Integer, HashMap <Integer, Libro>>)it.next();
			System.out.println((e.getKey() + "" + e.getValue().values()));
		}
	}
	
	public void BuscarLibro (HashMap <Integer, HashMap <Integer, Libro>> ests, Libro libro) {
		
		
	}
}
