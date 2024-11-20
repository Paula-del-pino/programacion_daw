package unidad02.boletin02;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número para ver si es primo o no"); 
		int numero = scan.nextInt();
		System.out.printf("El número %d es primo " , numero);
		System.out.printf("El número %d NO es primo " , numero);
		scan.close();
	}

}
