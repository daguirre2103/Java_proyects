package practica7_Ej13;

public class Auto {
	String modelo;
	String matricula;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void mostrar() {
		System.out.printf("Modelo: %s, Matricula: %s", this.getModelo(), this.getMatricula());
	}
}
