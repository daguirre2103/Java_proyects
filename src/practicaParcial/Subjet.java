package practicaParcial;

public interface Subjet {

	public void Agregar(Actualizador ac);
	public void Remover(Actualizador ac);
	public void notificar (Cliente c, double importe);
}
