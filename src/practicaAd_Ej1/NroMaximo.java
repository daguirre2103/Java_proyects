package practicaAd_Ej1;

public class NroMaximo implements VerificoEntero {

	@Override
	public void update(EnteroConLimites nro) {
		if (nro.getValor() > nro.getMaximo()) {
		System.out.println("El valor es mayor que el valor maximo establecido");
		}
	}

}
