package practica7_Ej18;

import java.util.*;


public class Estante {

	public Estante() {
		super();
		
	}
	
	public HashMap <Integer, Libro> ConstEstante () {
		
		HashMap <Integer, Libro> est= new HashMap <Integer, Libro>();
		Libro l1 = new Libro ("Familia", "David", "Panalab", 1999);
		Libro l2 = new Libro ("Familia2", "David", "Panalab", 2000);
		Libro l3 = new Libro ("Familia3", "David", "Panalab", 2001);
		Libro l4 = new Libro ("Familia4", "David", "Panalab", 2002);
		Libro l5 = new Libro ("Familia5", "David", "Panalab", 2003);
		
		est.put(1, l1);
		est.put(2, l2);
		est.put(3, l3);
		est.put(4, l4);
		est.put(5, l5);
		
		return est;
		
		
	}
	
	public HashMap <Integer, Libro> ConstEstante2 () {
		
		HashMap <Integer, Libro> est= new HashMap <Integer, Libro>();
		Libro l1 = new Libro ("Familia", "David", "Panalab", 1999);
		Libro l2 = new Libro ("Familia2", "David", "Panalab", 2000);
		Libro l3 = new Libro ("Familia3", "David", "Panalab", 2001);
		Libro l4 = new Libro ("Familia4", "David", "Panalab", 2002);
		Libro l5 = new Libro ("Familia5", "David", "Panalab", 2003);
		
		est.put(1, l1);
		est.put(2, l2);
		est.put(3, l3);
		est.put(4, l4);
		est.put(5, l5);
		
		return est;
		
		
	}

	public HashMap <Integer, Libro> ConstEstante3 () {
	
		HashMap <Integer, Libro> est= new HashMap <Integer, Libro>();
		Libro l1 = new Libro ("Familia6", "David", "Panalab", 2004);
		Libro l2 = new Libro ("Familia7", "David", "Panalab", 2005);
		Libro l3 = new Libro ("Familia8", "David", "Panalab", 2006);
		Libro l4 = new Libro ("Familia9", "David", "Panalab", 2007);
		Libro l5 = new Libro ("Familia10", "David", "Panalab", 2008);
	
		est.put(1, l1);
		est.put(2, l2);
		est.put(3, l3);
		est.put(4, l4);
		est.put(5, l5);
	
		return est;
	
	
	}

	public HashMap <Integer, Libro> ConstEstante4 () {
	
		HashMap <Integer, Libro> est= new HashMap <Integer, Libro>();
		Libro l1 = new Libro ("Familia11", "David", "Panalab", 2009);
		Libro l2 = new Libro ("Familia12", "David", "Panalab", 2010);
		Libro l3 = new Libro ("Familia13", "David", "Panalab", 2011);
		Libro l4 = new Libro ("Familia14", "David", "Panalab", 2012);
		Libro l5 = new Libro ("Familia15", "David", "Panalab", 2013);
	
		est.put(1, l1);
		est.put(2, l2);
		est.put(3, l3);
		est.put(4, l4);
		est.put(5, l5);
	
		return est;
	
	
	}

	public HashMap <Integer, Libro> ConstEstante5 () {
	
		HashMap <Integer, Libro> est= new HashMap <Integer, Libro>();
		Libro l1 = new Libro ("Familia16", "David", "Panalab", 2014);
		Libro l2 = new Libro ("Familia17", "David", "Panalab", 2015);
		Libro l3 = new Libro ("Familia18", "David", "Panalab", 2016);
		Libro l4 = new Libro ("Familia19", "David", "Panalab", 2017);
		Libro l5 = new Libro ("Familia20", "David", "Panalab", 2018);
	
		est.put(1, l1);
		est.put(2, l2);
		est.put(3, l3);
		est.put(4, l4);
		est.put(5, l5);
	
		return est;
	
	
	}
	
	public void AgregarLibro (HashMap <Integer, Libro> est, Libro libro) {
		
	}
	public void MostrarEstante (HashMap <Integer, Libro> est) {
		
		Iterator it = est.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Libro> e = (Map.Entry<Integer, Libro>)it.next();
			System.out.println(" Nro de libro: "+ (e.getKey() + " N. del libro: " + e.getValue().getNombre() + " Autor: " + e.getValue().getAutor() + " Editorial: " + e.getValue().getEditorial()+ " Año de publicacion: " + e.getValue().getDatePublicacion()));
			
			
			
		}
		
		 
		
	}
	
}
