package practica6_Ej6a;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora2 hora2 = new Hora2(12,30,21);
		Hora2 hora3 = new Hora2 (17, 22, 13);
		// hora2.mostrar(hora2.h, hora2.m, hora2.s);
		hora2.suma (hora2.h, hora2.m, hora2.s, hora3.h, hora3.m, hora3.s);
	}

}
