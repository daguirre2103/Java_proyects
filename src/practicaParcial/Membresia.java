package practicaParcial;

abstract class  Membresia {
	
	private double saldoMin;
	private double saldoMax;
	private double interes;
	
	public Membresia(double saldoMin, double saldoMax, double interes) {
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.interes = interes;
	}

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	
}
