package parcial2_161118;

import java.util.ArrayList;

abstract class Contenido {
	
	private String titulo;
	private Bag ref;
	private Hit hits;
	private Usuario propietario;
	private ArrayList<Usuario> colaboradores;
	
	public Contenido(String titulo, Bag ref, Hit hits, Usuario propietario, ArrayList<Usuario> colaboradores) {
		super();
		this.titulo = titulo;
		this.ref = ref;
		this.hits = hits;
		this.propietario = propietario;
		this.colaboradores = colaboradores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Bag getRef() {
		return ref;
	}

	public void setRef(Bag ref) {
		this.ref = ref;
	}

	public Hit getHits() {
		return hits;
	}

	public void setHits(Hit hits) {
		this.hits = hits;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public ArrayList<Usuario> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(ArrayList<Usuario> colaboradores) {
		this.colaboradores = colaboradores;
	}
	
	// Metodo para añadir colaborador
	public void AgregarColaborador (Usuario u) {
		this.colaboradores.add(u);
	}
	
	// Metodo para borrar colaborador
	public void BorrarColaborador (String n) {
		for (Usuario us: this.colaboradores) {
			if (us.getNombre().equals(n))
				this.colaboradores.remove(us);
		}
	}
	
	//Metodo para attachear una referencia a un bag en este en este bag
	public void AttachRef (Bag b) {
		this.setRef(b);
	}
	
	//Metodo para desattachear una referencia a un bag en este en este bag
	public void DesAttachRef (Bag b) {
		this.setRef(null);
	}
	
	abstract void Mostrar();
}	
