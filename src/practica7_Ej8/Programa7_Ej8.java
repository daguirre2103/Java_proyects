package practica7_Ej8;

public class Programa7_Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cta = new Cuenta(1, 2654.50);
		Transaccion tr = new Transaccion();
		tr.Consulta(cta);
		tr.Deposito(cta, 750.00);
		tr.Extraccion(cta, 459.00);
		
	}

}
