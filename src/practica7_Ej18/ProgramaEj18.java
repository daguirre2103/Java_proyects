package practica7_Ej18;

import java.util.*;

public class ProgramaEj18 {

	public static void main(String[] args) {
		
		//Creo los libros
		
		Libro l1 = new Libro ("Familia", "David", "Panalab", 1999);
		Libro l2 = new Libro ("Familia2", "David", "Panalab", 2000);
		Libro l3 = new Libro ("Familia3", "David", "Panalab", 2001);
		Libro l4 = new Libro ("Familia4", "David", "Panalab", 2002);
		Libro l5 = new Libro ("Familia5", "David", "Panalab", 2003);
		
		Libro[] libros = {l1, l2, l3, l4, l5};
		ArrayList<Libro> ls = new ArrayList<Libro>();
		
		for (Libro l: libros) {
			ls.add(l);
		}
				
		//Creo un estante y le agrego los libros.
		
		int indEst1 = 0;
		HashMap <Integer, Libro> est1;
		
		Estante est = new Estante();
		est1 = est.ConstEstante(indEst1, ls);
		est.MostrarEstante(est1);
		
		//Creo los libros2
		
		Libro l6 = new Libro ("Familia6", "David", "Panalab", 2004);
		Libro l7 = new Libro ("Familia7", "David", "Panalab", 2005);
		Libro l8 = new Libro ("Familia8", "David", "Panalab", 2006);
		Libro l9 = new Libro ("Familia9", "David", "Panalab", 2007);
		Libro l10 = new Libro ("Familia10", "David", "Panalab", 2008);
				
		Libro[] libros2 = {l6, l7, l8, l9, l10};
		ArrayList<Libro> ls2 = new ArrayList<Libro>();
				
		for (Libro la: libros2) {
			ls2.add(la);
		}
						
		//Creo un estante y le agrego los libros.
				
		int indEst2 = 6;
		HashMap <Integer, Libro> est2;
				
		Estante esta = new Estante();
		est2 = esta.ConstEstante(indEst2, ls2);
		esta.MostrarEstante(est2);
		
		//Creo una estanteria y le agrego los estantes
		
		ArrayList<HashMap<Integer, Libro>> estantes = new ArrayList<HashMap<Integer, Libro>>();
		
		estantes.add(est1);
		estantes.add(est2);
		
		int indiceE = 0;
		HashMap<Integer, HashMap<Integer, Libro>> estss =  new HashMap<Integer, HashMap<Integer, Libro>>();
		
		Estanterias estanteria = new Estanterias();
		estss = estanteria.ConstEstanterias(indiceE, estantes);
		estanteria.MostrarEstante(estss);
		
		int indEst3 = 11;
		Libro l11 = new Libro ("Familia11", "David", "Panalab", 2009);
		est2 = est.AgregarLibro(indEst3, l11, est2);
		est.MostrarEstante(est2);
		
		//Creo los libros3
		
		Libro l12 = new Libro ("Familia12", "David", "Panalab", 2010);
		Libro l13= new Libro ("Familia13", "David", "Panalab", 2011);
		Libro l14= new Libro ("Familia14", "David", "Panalab", 2012);
		Libro l15 = new Libro ("Familia15", "David", "Panalab", 2013);
		Libro l16 = new Libro ("Familia16", "David", "Panalab", 2014);
					
		Libro[] libros3 = {l12, l13, l14, l15, l16};
		ArrayList<Libro> ls3 = new ArrayList<Libro>();
				
		for (Libro lb: libros3) {
		ls3.add(lb);
		}
								
		//Creo un estante y le agrego los libros.
				
		int indEst4 = 12;
		HashMap <Integer, Libro> est3;
				
		Estante estb = new Estante();
		est3 = esta.ConstEstante(indEst4, ls3);
		estb.MostrarEstante(est3);
		
		int indiceE1 = 3;
		estss = estanteria.AgregarEstante(indiceE1, est3, estss);
		estanteria.MostrarEstante(estss);
		
	}
		
		
		
		
}
