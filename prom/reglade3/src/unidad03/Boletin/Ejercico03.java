package unidad03.Boletin;

import java.util.*;

public class Ejercico03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Dame el valor de a:");
			int a= scan.nextInt();
			System.out.println("Dame el valor de b: ");
			int b= scan.nextInt();
			int division= a/b;
			System.out.println(a + " entre " + b + " da: " + division);
		
		} catch (InputMismatchException e) {
            System.out.println("Error: No ha introducido números enteros.");

        } catch (ArithmeticException e) {
        	
            System.out.println("Error: División por cero no permitida.");
            
        } finally {
            scan.close();
        }
    }
}