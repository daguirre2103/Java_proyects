package practicaParcial;

public class ActualizadorBlack implements Actualizador {

	final String Nombre = "Black";
	
	public ActualizadorBlack () {
		
	}
	
	@Override
	public void update(Cliente c, double importe) {
		Black b = new Black ();		
		if ((c.getCta().getSaldo() < b.getSaldoMin()) || (c.getCta().getSaldo() > b.getSaldoMax())){
			
		}
	
	}

}
