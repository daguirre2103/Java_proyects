package practicaParcial;

public class Cuenta {

	private double saldo;
	private Membresia memb;
	
	public Cuenta(double saldo, Membresia memb) {
		super();
		this.saldo = saldo;
		this.memb = memb;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Membresia getMemb() {
		return memb;
	}

	public void setMemb(Membresia memb) {
		this.memb = memb;
	}
	
	
	
}
