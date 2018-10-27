package practica7_Ej18;

import java.util.*;


public class Estante {

	private int indice;
	private ArrayList<Libro> libros;
	
	public Estante() {
		
	}
	
	public HashMap <Integer, HashMap <String, Libro>> ConstEstante (int indice, HashMap <String, Libro> libros) {
		
		HashMap <Integer, HashMap <String, Libro>> est= new HashMap <Integer, HashMap <String, Libro>>();
		
		for(HashMap <String, Libro> libroAux : libros)
			est.put(indice++, libroAux);
		
		return est;
	
	}

	public HashMap <Integer, Libro> AgregarLibro (int indice, Libro libro, HashMap <Integer, Libro> est) {
		est.put(indice, libro);
		return est;
	}
	
	public void MostrarEstante (HashMap <Integer, Libro> est) {
		
		Iterator it = est.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Libro> e = (Map.Entry<Integer, Libro>)it.next();
			System.out.println(" Nro de libro: "+ (e.getKey() + " N. del libro: " + e.getValue().getNombre() + " Autor: " + e.getValue().getAutor() + " Editorial: " + e.getValue().getEditorial()+ " A�o de publicacion: " + e.getValue().getDatePublicacion()));
		}
	}
	
	public boolean BuscarLibro (HashMap <Integer, Libro> libros, Integer nLibro) {
		
	}
}
