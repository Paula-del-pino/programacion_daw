package unidad02.boletin02;
/**
 *  Realiza un programa que nos diga cuántos dígitos tiene un número entero que 
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa calcula el número de cifras de un número introducido");
		System.out.println("Introduce un número entero: ");
		int num = teclado.nextInt();
		teclado.close(); 
		int numActual = num;
		int numCifras = 0;
		while (numActual/10 !=0) {
			numCifras++;
			numActual = numActual/10;
		}
		System.out.println("El número " + num + " tiene " + numCifras + " cifras.");
	}

}
