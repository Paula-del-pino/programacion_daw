package unidad02;

import java.util.Scanner;

public class MayorNumerode3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa devuelve el mayor de tres números introducidos");
		System.out.print("Introduce el primer número");
		int numero1 = scan.nextInt();
		System.out.print("\nIntroduce el segundo número");
		int numero2 = scan.nextInt();
		System.out.print("\nIntroduce el tercer número");
		int numero3 = scan.nextInt();
		
		scan.close();
		
		int mayor;
		 if (numero1 > numero2) {
			 mayor = numero1;
			 if (mayor < numero3) {
				 mayor = numero3;
			 }
	} else {
		mayor = numero2;
		if (mayor < numero3) {
		mayor = numero3;
		}
	}
		 // Se mostrará el resultado
	  System.out.print("\nEl número mayor es: " + mayor);
	}
}
