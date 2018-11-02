package practica7_Ej18;

import java.util.*;


public class Estante {

	private int indice;
	private ArrayList<Libro> libros;
	
	public Estante() {
		
	}
	
	public HashMap <Integer, HashMap <String, Libro>> ConstEstante (int indice, HashMap <String, Libro> libros) {
		
		HashMap <Integer, HashMap <String, Libro>> est= new HashMap <Integer, HashMap <String, Libro>>();
		
		Iterator it = libros.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer,HashMap <String, Libro>> e = (Map.Entry<Integer,HashMap <String, Libro>>)it.next();
			 est.put(indice++, (HashMap<String, Libro>) e);
		
		}
		return est;
	}

	public HashMap <Integer, Libro> AgregarLibro (int indice, Libro libro, HashMap <Integer, Libro> est) {
		est.put(indice, libro);
		return est;
	}
	
	public void MostrarEstante (HashMap <Integer, HashMap <String, Libro>> est) {
		
		Iterator it = est.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, HashMap <String, Libro>> e = (Map.Entry<Integer, HashMap <String, Libro>>)it.next();
				Iterator it2 = e.getValue().entrySet().iterator();
					while (it2.hasNext()) {
						Map.Entry<String, Libro> e2 = (Map.Entry<String, Libro>)it2.next();
						System.out.println(" Nro de libro: "+ (e.getKey() + " N. del libro: " + e2.getKey() +  " N. del libro: " + e2.getValue().getNombre()+ " Autor: " + e2.getValue().getAutor() + " Editorial: " + e2.getValue().getEditorial()+ " Año de publicacion: " + e2.getValue().getDatePublicacion()));
					}
		}
	
	}
}
