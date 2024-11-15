package sumando;
import java.util.Scanner;
public class Sumando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un número");
		double num = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Introduce otro número");
		double num2 = entrada.nextDouble();
		entrada.close();
		System.out.println(num + num2);
	}

}
