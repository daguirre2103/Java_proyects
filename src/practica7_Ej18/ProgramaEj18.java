package practica7_Ej18;

import java.util.*;

public class ProgramaEj18 {

	public static void main(String[] args) {
		
		//Creo la Biblioteca y los estantes y un indice
		
		Estanterias ests = new Estanterias();
		Estante est1 = new Estante();
		Estante est2 = new Estante();
		Estante est3 = new Estante();
		
		
		int indice = 1;
		int indice2 = 1;
		
		//Creo los libros y los agrego a un estante
		
		Libro l1 = new Libro ("Familia", "David", "Panalab", 1999);
		Libro l2 = new Libro ("Familia2", "David", "Panalab", 2000);
		Libro l3 = new Libro ("Familia3", "David", "Panalab", 2001);
		Libro l4 = new Libro ("Familia4", "David", "Panalab", 2002);
		Libro l5 = new Libro ("Familia5", "David", "Panalab", 2003);
		
		Libro[] libros = {l1, l2, l3, l4, l5};
		
		for (Libro l: libros) {
			est1.libros.put(indice++, l);
		}
		
		//Creo los libros2
		
		Libro l6 = new Libro ("Familia6", "David", "Panalab", 2004);
		Libro l7 = new Libro ("Familia7", "David", "Panalab", 2005);
		Libro l8 = new Libro ("Familia8", "David", "Panalab", 2006);
		Libro l9 = new Libro ("Familia9", "David", "Panalab", 2007);
		Libro l10 = new Libro ("Familia10", "David", "Panalab", 2008);
				
		Libro[] libros2 = {l6, l7, l8, l9, l10};
						
		for (Libro la: libros2) {
			est2.libros.put(indice++, la);
		}
		
		//Creo los libros3
		
		Libro l12 = new Libro ("Familia12", "David", "Panalab", 2010);
		Libro l13= new Libro ("Familia13", "David", "Panalab", 2011);
		Libro l14= new Libro ("Familia14", "David", "Panalab", 2012);
		Libro l15 = new Libro ("Familia15", "David", "Panalab", 2013);
		Libro l16 = new Libro ("Familia16", "David", "Panalab", 2014);
					
		Libro[] libros3 = {l12, l13, l14, l15, l16};
		
		for (Libro lb: libros3) {
			est3.libros.put(indice++, lb);
		}
	
		//Agrego los estantes en la estanteria
		
		Estante[] estantes = {est1,est2, est3};
		
		for (Estante e: estantes) {
			ests.ests.put(indice2++, e);
		}
		
		//Creo un buscador y busco un libro
		
		Buscador b = new Buscador();
		b.Buscar(ests, "Familia15");
		
	}
		
		
		
		
}
