package unidad01;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número entero y veremos si es par o impar");
		int numero = scan.nextInt();
		String paridad;
		paridad = numero % 2 == 0 ? "PAR" : "IMPAR";
		System.out.println("El número introducido es " + paridad);
		scan.close();
		

	}

}
