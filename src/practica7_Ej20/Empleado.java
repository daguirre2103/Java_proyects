package practica7_Ej20;

public class Empleado {
	
	private int id;
	private String Nombre;
	private String Apellido;
	
	public Empleado(int id, String nombre, String apellido) {
		super();
		this.id = id;
		Nombre = nombre;
		Apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	
}
