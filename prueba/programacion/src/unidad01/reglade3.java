package unidad01;

import java.util.Scanner;

public class reglade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("""
				Introduce los valores para resolver la regla de 3
				a ---> b
				x ---> c
				""");
		// Declaración del objeto Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el dato a:");
		double a = scan.nextDouble();
		System.out.print("\nIntroduce el dato c:");
		double b = scan.nextDouble();
		System.out.print("\nIntroduce el dato b:");
		double c = scan.nextDouble();
		// solución x = (b*c)/a
		double x = (b*c)/a;
		System.out.println ("\nLa solución de la regla de 3 es");
		System.out.print (a);
		System.out.print("--->");
		System.out.println (b);
		System.out.print (c);
		System.out.print("--->");
		System.out.print(x); 
		scan.close();
	}

}
