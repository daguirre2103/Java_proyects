package practicaAd_Ej1;

public class EnteroConLimites implements Subjet {

	private int minimo = 25;
	private int maximo = 70;
	
	int valor;
	
		public EnteroConLimites(int valor) {
		super();
		this.valor = valor;
	}

		public int getMinimo() {
			return minimo;
		}

		public void setMinimo(int minimo) {
			this.minimo = minimo;
		}

		public int getMaximo() {
			return maximo;
		}

		public void setMaximo(int maximo) {
			this.maximo = maximo;
		}

		public int getValor() {
			return valor;
		}

		@Override
		public void Agregar(Observer obs) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void remover(Observer obs) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void notificar() {
			// TODO Auto-generated method stub
			
		}
		
		public void VerificarNro () {
			
		}

		
	

}
