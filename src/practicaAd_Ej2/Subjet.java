package practicaAd_Ej2;

public interface Subjet {

	public void Agregar(Observer obs);
	public void Remover(Observer obs);
	public void notificar(Escritor esc);
	
}
