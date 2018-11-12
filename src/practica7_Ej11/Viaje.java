package practica7_Ej11;

abstract class Viaje {
	
	private String origen;
	private String destino;
	private double distancia;
	private int nroEstaciones;
	private int nroVagones;
	private int NroPasajeros;
	
	public Viaje(String origen, String destino, double distancia, int nroEstaciones, int nroVagones, int nroPasajeros) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
		this.nroEstaciones = nroEstaciones;
		this.nroVagones = nroVagones;
		NroPasajeros = nroPasajeros;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public int getNroEstaciones() {
		return nroEstaciones;
	}

	public void setNroEstaciones(int nroEstaciones) {
		this.nroEstaciones = nroEstaciones;
	}

	public int getNroVagones() {
		return nroVagones;
	}

	public void setNroVagones(int nroVagones) {
		this.nroVagones = nroVagones;
	}

	public int getNroPasajeros() {
		return NroPasajeros;
	}

	public void setNroPasajeros(int nroPasajeros) {
		NroPasajeros = nroPasajeros;
	}
	
	
	
}
