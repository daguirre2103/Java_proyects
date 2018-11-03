package practicaAd_Ej2;

public class Diarios implements Observer {

	@Override
	public void update(Escritor esc) {
		System.out.println("El escritor continua su bestSeller");
		System.out.println(esc.getTexto());
		
	}

}
