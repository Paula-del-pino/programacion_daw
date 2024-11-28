package unidad04;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length ; i++) {
			
			System.out.println("Introduce un número: ");
			numeros[i] = scan.nextInt();
			
		}
		scan.close();
		
		//Para que los números salgan invertidos ponerlo al reves
		// el contenido del for
		// for (int i = numeros.length - 1; i>=0 ;i--) {
		//Para que salga con coma:
		
		for (int i = numeros.length - 1; i > 0; i--) {
			
			System.out.println(numeros[i] + ", ");
			
			System.out.println(numeros[i]);
		}

	}

}
