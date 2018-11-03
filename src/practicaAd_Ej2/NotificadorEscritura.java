package practicaAd_Ej2;

public class NotificadorEscritura {

	public void VerEscritura(Escritor esc) {
		if (esc.getTexto() == "FIN") {
			System.out.println("El escitor termino su nuevo libro");
		}else {
			Ingresador ing = new Ingresador();
			ing.notificar(esc);
		}
	}
}
