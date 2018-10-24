package practica7_Ej13;

public class ProgramaEj13 {

	public static void main(String[] args) {
		Auto a = new Auto();
		a.setModelo("BMW");
		a.setMatricula("ABC 245689 MEC");
		Wrapper<Auto> auto = new Wrapper<Auto>(a);
		
		
	}

}
