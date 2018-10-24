package practica6_Ej6a;

public class Hora2 {
	int h;
	int m;
	int s;
	
	public Hora2(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public void mostrar (int h, int m, int s) {
			System.out.printf("%d:%d:%d", h, m, s);
	}
	
	public void suma (int h, int m, int s, int h2, int m2, int s2 ) {
		
		int htotales;
		int mtotales;
		int stotales;
		
		htotales = h + h2;
		mtotales = m + m2;
		stotales = s + s2;
		
		if (stotales >= 60) {
			stotales = stotales - 60;
			mtotales = mtotales +1;
		}
		if (mtotales >= 60) {
			mtotales = mtotales - 60;
			htotales = htotales + 1;
		}
		if (htotales > 23) {
			htotales = htotales - 24; 
		}
		System.out.printf("%d:%d:%d", htotales, mtotales, stotales);
		
	}	
}
