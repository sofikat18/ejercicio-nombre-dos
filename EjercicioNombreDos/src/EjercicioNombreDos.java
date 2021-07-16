import java.util.Scanner; 
public class EjercicioNombreDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(saludo());
		

		Scanner leer = new Scanner (System.in);
		System.out.println("Escribe tu nombre: ");
		String nombre = leer.nextLine();
		System.out.println(saludo2(nombre));
	}
	
	/*public static String saludo() {
	*	System.out.println("Por favor, escriba su nombre: ");
	*	String nombreUser = "";
	*	Scanner nombreEscaneado = new Scanner (System.in);
	*	nombreUser = nombreEscaneado.nextLine(); 
	*	return "Gracias. Bienvenide, " + nombreUser + ".";
	}
	*/
	
	public static String saludo2(String nombre) {
		return "Hola, " + nombre;
		
	}

}
