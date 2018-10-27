package practica7_Ej18;

import java.util.*;


public class Estante {

	private int indice;
	private ArrayList<Libro> libros;
	
	public Estante() {
		
	}
	
	public HashMap <Integer, Libro> ConstEstante (int indice, ArrayList<Libro> libros) {
		
		HashMap <Integer, Libro> est= new HashMap <Integer, Libro>();
		
		for(Libro libroAux : libros)
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
			System.out.println(" Nro de libro: "+ (e.getKey() + " N. del libro: " + e.getValue().getNombre() + " Autor: " + e.getValue().getAutor() + " Editorial: " + e.getValue().getEditorial()+ " Año de publicacion: " + e.getValue().getDatePublicacion()));
			
			
			
		}
		
		 
		
	}
	
}
