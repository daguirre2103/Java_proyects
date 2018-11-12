package practicaParcial;

import java.util.ArrayList;

public class Banco implements Subjet {
	
	private String Nombre;
	ArrayList<Cliente> clientes;
	Actualizador ac = new Actualizador();
	
	public Banco(String nombre, ArrayList<Cliente> clientes) {
		super();
		Nombre = nombre;
		this.clientes = clientes;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void Depositar (Cliente c) {
		
	}
	
	public void Extraer (Cliente c) {
		
	}

	@Override
	public void Agregar(Actualizador ac) {
		Actualizador a = null;
		a = ac;
		
	}

	@Override
	public void Remover(Actualizador ac) {
		ac = null;
		
	}

	@Override
	public void notificar(Cliente c, double importe) {
		// TODO Auto-generated method stub
		
	}
	
}
