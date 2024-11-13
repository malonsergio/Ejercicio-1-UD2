package mostrandodatos;
import java.util.Scanner;
public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = entrada.nextLine();
		System.out.print("Introduzca, su apellido: ");
		String apellido = entrada.nextLine();
		System.out.println("Ha introducido: " + nombre + " " + apellido);
		entrada.close();
		

	}

}
