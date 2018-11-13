package practica7_Ej19;


public class Programa7_Ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgendaTelefonica ag = new AgendaTelefonica();
		
		Persona a = new Persona ("David Aguirre", "Campicuelo 3247", 1557159308);
		Persona b = new Persona ("Karen Zorn", "Campicuelo 3248", 1557159308);
		Persona c = new Persona ("Natalia Suelves", "Campicuelo 3249", 1557159308);
		Persona d = new Persona ("Marcos Trosch", "Campicuelo 3250", 1557159308);
		Persona e = new Persona ("Ivan Martorello", "Campicuelo 3251", 1557159308);
		
		ag.Agregar(a);
		ag.Agregar(b);
		ag.Agregar(c);
		ag.Agregar(d);
		ag.Agregar(e);
	
		ag.Mostrar();
		
		ag.Buscar("Natalia Suelves");
		
		ag.Eliminar("Karen Zorn");
		
		ag.Mostrar();
	}
		
	
		
}
