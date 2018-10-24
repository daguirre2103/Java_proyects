package practica7_ej6;

public class Rectangulo {
	protected int lado1;
	protected int lado2;
	protected int lado3;
	protected int lado4;
	
	public Rectangulo(int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado1;
		this.lado4 = lado2;
	}
	
	public void area (int base, int altura) {
		System.out.println("El area es:"+ base*altura);
	}
	
	
	
}

