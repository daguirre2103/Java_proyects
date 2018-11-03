package practicaAd_Ej2;

import java.util.ArrayList;

public class Ingresador implements Subjet {

	private static ArrayList<Observer> observadores = new ArrayList<Observer>();
	
	
	@Override
	public void Agregar(Observer obs) {
		observadores.add(obs);
		
	}

	@Override
	public void Remover(Observer obs) {
		observadores.add(obs);
		
	}

	@Override
	public void notificar(Escritor esc) {
		for (int i=0; i < observadores.size(); i++) {
			observadores.get(i).update(esc);
		}
		
	}

}
