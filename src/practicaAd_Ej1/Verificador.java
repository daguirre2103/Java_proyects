package practicaAd_Ej1;

public class Verificador implements Observer {

	@Override
	public void updateMin() {
		System.out.println("El numero es menor al limite permitido");
	}

	@Override
	public void updateMax() {
		System.out.println("El numero es mayor al limite permitido");
		
	}

	

}
