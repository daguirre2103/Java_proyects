package practica7_Ej11;

public class Programa7_Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Viaje_diesel v = new Viaje_diesel("Castelar", "Once", 30, 8, 10, 70);
		Viaje_electrico v2 = new Viaje_electrico("Castelar", "Once", 30, 8, 10, 70);
		Viaje_altaV v3 = new Viaje_altaV("Castelar", "Once", 30, 8, 10, 70);
		v.TiempoDeViaje();
		v2.TiempoDeViaje();
		v3.TiempoDeViaje();
		
	}

}
