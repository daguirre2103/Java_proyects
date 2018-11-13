package practica7_Ej19;

import java.util.ArrayList;



public class AgendaTelefonica {
	
	private ArrayList <Persona> agenda = new ArrayList<>();

	public AgendaTelefonica() {
		
	}
	
	public void Agregar(Persona p) {
		agenda.add(p);
	}
	
	public void Eliminar(String s) {
				
		for (Persona p: agenda) {
			if (p.getNombre() == s) {
				agenda.remove(p);
			}else {
				System.out.println("El nombre ingresado no existe en la agenda");
			}
		}
	}
	
	public void Buscar(String s) {
		
		for (Persona p: agenda) {
			if (p.getNombre() == s) {
				System.out.println("Direccion: " + p.getDireccion() + "; Telefono:" + p.getTelefono());
			}else {
				System.out.println("El nombre ingresado no existe en la agenda");
			}
		}
	}
	
	public void Mostar () {
		for (Persona p: agenda) {
				System.out.println("Nombre:" + p.getNombre() + "Direccion: " + p.getDireccion() + "; Telefono:" + p.getTelefono());
		}
	}
}
