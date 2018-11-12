package practica7_Ej8;

public class Cuenta {

	private int nro;
	private double saldo;
	
	public Cuenta(int nro, double saldo) {
		super();
		this.nro = nro;
		this.saldo = saldo;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
