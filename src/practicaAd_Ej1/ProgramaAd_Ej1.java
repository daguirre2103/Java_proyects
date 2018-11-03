package practicaAd_Ej1;

public class ProgramaAd_Ej1 {

	public static void main(String[] args) {
		
		AlarmaEntero a = new AlarmaEntero();
		a.Agregar(new NroMaximo());
		a.Agregar(new NroMinimo());
		
		EnteroConLimites ent = new EnteroConLimites(19);
		a.notificar(ent);
	}

}
