package com.PaulaAlumna.tarea2;

import java.util.Scanner; 

public class Contrasenia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Contrasenia = contrasenia123
		String contrCorrecta = "contrasenia123";
		
		// 3 Intentos de contraseña max
		int intentosMax = 3;
		int intentos = 0;
		boolean contrCorrectIntroducida = false;
		
		// Aquí abajo escribiré el bucle de 3 intentos
		// Pedimos al usuario la contraseña
		
		while ( intentos <  intentosMax  && !contrCorrectIntroducida) {
			System.out.println("Introduce tu contraseña: ");
			String contrIntroducida = scan.nextLine();
			if (contrIntroducida.equals(contrCorrecta)) {
				contrCorrectIntroducida = true;
				System.out.println("¡Contraseña Correcta! Bienvenido.");
			} else {
				intentos++;
				System.out.println("Contraseña Incorrecta. Porfavor introduzca la Contraseña Correcta: ");
				System.out.println("Intento " + intentos + "de " + intentosMax);
				
			}
		}
		
		// El usuario ha agotado todos los intentos
		if (!contrCorrectIntroducida) {
			System.out.println("Has agotado el número de intentos. Programa terminado");
		}
		
		scan.close();

	}

}
