package practica7_Ej20;

import java.util.ArrayList;

public class Area {
	
	private String Nombre;
	private ArrayList <Empleado> empleados;
	
	public Area(String nombre) {
		Nombre = nombre;
		ArrayList<Empleado> emp = new ArrayList<>();
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
	
}
