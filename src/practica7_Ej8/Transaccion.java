package practica7_Ej8;

public class Transaccion {

	public void Consulta (Cuenta c) {
		System.out.println("Nro Cuenta:" + c.getNro() + "Saldo disponible:" + c.getSaldo());
	}
	
	public void Extraccion (Cuenta c, double imp) {
		if (c.getSaldo() < imp) {
			System.out.println("Ud. no tiene suficiente saldo");
		}else {
			c.setSaldo(c.getSaldo() - imp);
			System.out.println("Su nuevo saldo disponible es:" + c.getSaldo());
		}
	}
	
	public void Deposito (Cuenta c, double imp) {
		c.setSaldo(c.getSaldo() + imp);
		System.out.println("Nro Cuenta:" + c.getNro() + "Saldo disponible:" + c.getSaldo());
	}
}
