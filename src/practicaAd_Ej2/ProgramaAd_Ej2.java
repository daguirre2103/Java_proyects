package practicaAd_Ej2;

public class ProgramaAd_Ej2 {

	public static void main(String[] args) {
		Ingresador ing = new Ingresador();
		ing.Agregar(new Editoriales());
		ing.Agregar(new Diarios());
		
		Escritor esc = new Escritor("FIN");
		
		NotificadorEscritura not = new NotificadorEscritura();
		not.VerEscritura(esc);
		
	}

}
