package practica7_Ej19;

import java.util.ArrayList;
import java.util.Iterator;


public class AgendaTelefonica {
	
	private ArrayList <Persona> agenda = new ArrayList<>();

	public AgendaTelefonica() {
		
	}
	
	public void Agregar(Persona p) {
		agenda.add(p);
	}
	
	public void Eliminar(String s) {
				
		for (int i=0; i < agenda.size(); i++) {
			if (agenda.get(i).getNombre().equals(s)) {
				agenda.remove(i);
			}
		}
	}
	
	public void Buscar(String s) {
		
		for (Persona p: agenda) {
			if (p.getNombre().equals(s)) {
				System.out.println("Direccion: " + p.getDireccion() + " ; " + "Telefono: " + p.getTelefono());
			}
		}
	}
		
	
	
	public void Mostrar () {
		for (Persona p: agenda) {
				System.out.println("Nombre:" + p.getNombre() + "Direccion: " + p.getDireccion() + "; Telefono:" + p.getTelefono());
		}
	}
}
