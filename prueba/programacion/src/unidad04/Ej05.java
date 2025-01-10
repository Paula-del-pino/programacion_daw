package unidad04;

import java.util.Scanner;

public class Ej05 {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
			
			int[] numeros = new int[20];
			System.out.println("Introduce : ");
			
			for(int i=0;i<numeros.length ;i++) {
				numeros[i] = scan.nextInt();
			}
			
			//ROTAR empezando por el último
			int ultimo = numeros[numeros.length-1];
			for(int i = numeros.length - 1; i>0; i--) {
				
				numeros[i] = numeros[i-1];
				
			} numeros[0] = ultimo;
	
			scan.close();
			
	}
}