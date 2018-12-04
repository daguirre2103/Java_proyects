package practicaParcial;

import java.util.*;

public class Banco implements Subjet {
	
	private String Nombre;
	HashMap <Integer, Cliente> Clientes;
	ArrayList <Actualizador> actualizadores = new ArrayList <Actualizador>();
		
	public Banco(String nombre, HashMap <Integer, Cliente> clientes) {
		super();
		Nombre = nombre;
		this.Clientes = clientes;
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public HashMap<Integer, Cliente> getClientes() {
		return Clientes;
	}

	public void setClientes(HashMap<Integer, Cliente> clientes) {
		Clientes = clientes;
	}

	public void Depositar (Integer clave, double importe) {
			
		if (Clientes.containsKey(clave)) {
		 Cliente cl = Clientes.get(clave);
		 cl.getCta().setSaldo(cl.getCta().getSaldo() + importe);
			notificar (cl, cl.getCta().getSaldo());
		}else {
			System.out.println("Clave incorrecta, intentelo de nuevo");
		}
	}
	
	public void Extraer (Integer clave, double importe) {
		if (Clientes.containsKey(clave)) {
			Cliente cl = Clientes.get(clave);
			if (cl.getCta().getSaldo() < importe) {
				System.out.println("Saldo insuficiente, haga un deposito primero");
			}else {
				cl.getCta().setSaldo(cl.getCta().getSaldo() - importe);
				notificar (cl, cl.getCta().getSaldo());
			}
		}else {
				System.out.println("Clave incorrecta, intentelo de nuevo");
		}
	}

	@Override
	public void Agregar(Actualizador ac) {
		
		if (!this.actualizadores.contains(ac)) {
			this.actualizadores.add(ac);
		}else {
			System.out.println("Este actualizador ya esta en la lista");
		}
		
	}

	@Override
	public void Remover(Actualizador ac) {
		
		if (this.actualizadores.contains(ac)) {
			int i = this.actualizadores.indexOf(ac);
			this.actualizadores.remove(i);
		}else {
			System.out.println("Este actualizador no exite en la lista");
		}
		
	}

	@Override
	public void notificar(Cliente c, double importe) {
		for (Actualizador ac: this.actualizadores) {
			ac.update(c, importe);
		}
		
	}
	
}
