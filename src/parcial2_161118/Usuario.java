package parcial2_161118;

import java.util.ArrayList;

public class Usuario {
	
	private int id;
	private String nombre;
	private Bag bag;
	
	public Usuario(int id, String nombre, Bag bag) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.bag = bag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Bag getBag() {
		return bag;
	}

	public void setBag(Bag bag) {
		this.bag = bag;
	}
	
	// Metodo para generar un hit en un bag propio
	
	public void GenerarHit (String s) {
		for (Contenido o: this.bag.getContenidos()) {
			if (o.getTitulo().equals(s)) {
				
			}
		}
	}
	
	public void MostrarRef (ArrayList<Contenido> cs) {
		for (Contenido o: cs) {
			o.Mostrar();
		}
	}
	// Metodo para Mostrar un bag.
	
	public void MostarBag () {
		for (Contenido o: this.bag.getContenidos()) {
			o.Mostrar();
			MostrarRef(o.getRef().getContenidos());		
		}
	}
}