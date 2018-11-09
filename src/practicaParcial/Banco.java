package practicaParcial;

import java.util.ArrayList;

public class Banco {
	
	private String Nombre;
	ArrayList<Cliente> clientes;
	
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
	
}
