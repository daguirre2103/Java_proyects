package practica7_Ej11;

public class Viaje_electrico extends Viaje {

	public Viaje_electrico(String origen, String destino, double distancia, int nroEstaciones, int nroVagones,
			int nroPasajeros) {
		super(origen, destino, distancia, nroEstaciones, nroVagones, nroPasajeros);
		// TODO Auto-generated constructor stub
	}
	
	public void TiempoDeViaje() {
		double t;
		t = (this.getDistancia()*(this.getNroEstaciones()/2));
		System.out.println("Tiempo de viaje:"+ t + "minutos");
	}
}
