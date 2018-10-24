package practica6_Ej6a;

public class Hora {
	int h = 0;
	int m = 0;
	int s = 0;
	
	
	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public void mostrar (int h, int m, int s) {
		System.out.printf("%d:%d:%d", h, m, s);
	}
}
