package unidad03.Boletin;

import java.util.Scanner;

public class digitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa indicará si un número es o no capicúa.");
		System.out.println("Introduce un número: ");
		long numero = scan.nextLong();
		long numActual = numero;
		int numCifras = 1;
		while (numActual / 10 != 0) {
			numCifras++;
			numActual = numActual / 10;
		}
		
		boolean capicua = true;
		for (int i = 0; i < numCifras / 2; i++) {
			long numDiv = (long) Math.pow(10, numCifras - i - 1);
			long numMod = (long) Math.pow(10, i);
			double numDelante = (numero / numDiv) % 10;
			double numDetras = (numero / numMod) % 10;
			if (numDelante != numDetras) {
				capicua = false;
			}
		}
		if (capicua) {
			System.out.println("ES CAPICUA");
		} else {
			System.out.println("NO ES CAPICUA");
		}
	}
}