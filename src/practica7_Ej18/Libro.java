package practica7_Ej18;

public class Libro {
	
	private String nombre;
	private String autor;
	private String editorial;
	private int datePublicacion;
	
	public Libro(String nombre, String autor, String editorial, int datePublicacion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.datePublicacion = datePublicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getDatePublicacion() {
		return datePublicacion;
	}

	public void setDatePublicacion(int datePublicacion) {
		this.datePublicacion = datePublicacion;
	}
	
	
}
