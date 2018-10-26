package practica7_Ej18;

import java.util.HashMap;

public class ProgramaEj18 {

	public static void main(String[] args) {
		
		Estante est = new Estante();
		HashMap<Integer, HashMap<Integer, Libro>> ests1 = new HashMap<Integer, HashMap<Integer, Libro>>();
		Estanterias ests = new Estanterias(ests1);
		
		HashMap <Integer, Libro> est1= new HashMap <Integer, Libro>();
		HashMap <Integer, Libro> est2= new HashMap <Integer, Libro>();
		HashMap <Integer, Libro> est3= new HashMap <Integer, Libro>();
		HashMap <Integer, Libro> est4= new HashMap <Integer, Libro>();
		HashMap <Integer, Libro> est5= new HashMap <Integer, Libro>();
		
		est1 = est.ConstEstante();
		est.MostrarEstante(est1);
		
		est2 = est.ConstEstante2();
		est.MostrarEstante(est2);
		
		est3 = est.ConstEstante3();
		est.MostrarEstante(est3);
		
		est4 = est.ConstEstante4();
		est.MostrarEstante(est4);
		
		est5 = est.ConstEstante5();
		est.MostrarEstante(est5);
		
		ests.agregarEstante(est1, ests1);
		ests.agregarEstante(est2, ests1);
		ests.agregarEstante(est3, ests1);
		ests.agregarEstante(est4, ests1);
		ests.agregarEstante(est5, ests1);
		
		ests.MostrarEstante(ests1);
		
	}

}
