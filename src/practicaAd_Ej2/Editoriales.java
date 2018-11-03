package practicaAd_Ej2;

public class Editoriales implements Observer {

	@Override
	public void update(Escritor esc) {
		System.out.println("El escritor sigue entregando capitulos de su nuevo");
		System.out.println(esc.getTexto());
		
	}

}
