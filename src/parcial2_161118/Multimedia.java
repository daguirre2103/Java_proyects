package parcial2_161118;

import java.util.ArrayList;

abstract class Multimedia extends Contenido {

	private String descripcion;
	private String url;
	
	public Multimedia(String titulo, Bag ref, Hit hits, Usuario propietario, ArrayList<Usuario> colaboradores, String descripcion, String url) {
		super(titulo, ref, hits, propietario, colaboradores);
		this.descripcion = descripcion;
		this.url = url;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public void Mostrar () {
		System.out.print("Titulo: " + this.getTitulo()  + "; " + "Descripcion:" + this.getDescripcion() + "; " + this.getUrl() + ";");
			
		}
		
}

