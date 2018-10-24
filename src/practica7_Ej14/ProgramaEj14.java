package practica7_Ej14;

public class ProgramaEj14 {

	public static void main(String[] args) {
		Par<Integer, Integer> a = new Par<Integer, Integer>(12, 24);
		System.out.printf("%d, %d\n", a.getPrimero(), a.getSegundo());
		a.setPrimero(15);
		a.setSegundo(34);
		System.out.printf("%d, %d\n", a.getPrimero(), a.getSegundo());

	}

}
