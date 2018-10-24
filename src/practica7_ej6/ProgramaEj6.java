package practica7_ej6;

public class ProgramaEj6 {

	public static void main(String[] args) {
		Rectangulo rect = new Rectangulo (5, 7);
		Rectangulo cuad = new Cuadrado (8, 8);
		rect.area(rect.lado1, rect.lado2);
		cuad.area(cuad.lado1, cuad.lado2);

	}

}
