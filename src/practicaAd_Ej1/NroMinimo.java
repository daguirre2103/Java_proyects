package practicaAd_Ej1;

public class NroMinimo implements VerificoEntero {

	@Override
	public void update(EnteroConLimites nro) {
		if (nro.getValor() < nro.getMinimo()) {
		System.out.println("El valor es menor que el valor minino establecido");
		}
		
	}

}
