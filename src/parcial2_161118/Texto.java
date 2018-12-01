package parcial2_161118;

import java.util.ArrayList;

public class Texto extends Contenido {
	
	private String contenido;
	
	public Texto(String titulo, Bag ref, Hit hits, Usuario propietario, ArrayList<Usuario> colaboradores, String contenido) {
		super(titulo, ref, hits, propietario, colaboradores);
		this.contenido = contenido;
	}
	
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	void Mostrar() {
		System.out.print("Titulo: " + this.getTitulo() + "; " + this.getContenido()+ ";");
		
	}
}


	

	

