package practicaParcial;

public class Cliente {

	private int dni;
	private Cuenta cta;
	
	public Cliente(int dni, Cuenta cta) {
		super();
		this.dni = dni;
		this.cta = cta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Cuenta getCta() {
		return cta;
	}

	public void setCta(Cuenta cta) {
		this.cta = cta;
	}
	
	
	
	
	
}
