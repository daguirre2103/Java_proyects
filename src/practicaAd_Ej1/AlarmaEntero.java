package practicaAd_Ej1;

import java.util.ArrayList;

public class AlarmaEntero implements Subjet {

	private static ArrayList<VerificoEntero> observadores = new ArrayList <VerificoEntero>();
	
	
	@Override
	public void Agregar(VerificoEntero obs) {
		observadores.add(obs);
		
	}

	@Override
	public void remover(VerificoEntero obs) {
		observadores.remove(obs);
		
	}

	@Override
	public void notificar(EnteroConLimites nro2) {
		for (int i = 0; i < observadores.size(); i++) {
			observadores.get(i).update(nro2);
		}
		
	}

}
