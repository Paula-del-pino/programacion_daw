package unidad02.boletin02;

import java.util.Scanner;

public class Ejercicio2 {
/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo 
 *ax+b=0). 
 *Ejemplo 1: 
 *Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Introduce el valor de a: ");
		double a = scan.nextDouble();
		System.out.println("Introduce el valor de b: ");
		double b = scan.nextDouble();
		
		if  (a==0) {
			if (b==0) {
				System.out.println("La ecuación tiene infinitas soluciones.");
			} else {
				System.out.println("La ecuación no tiene solución.");
			}
		} else {
			double x = -b / a;
			System.out.println("La solución es x = " + x); 
			
		} scan.close();
	}
		
}
