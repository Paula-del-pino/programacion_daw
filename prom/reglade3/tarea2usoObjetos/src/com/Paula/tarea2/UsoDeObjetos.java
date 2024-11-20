package com.Paula.tarea2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UsoDeObjetos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce tu edad: ");
            int edad = scanner.nextInt();

            System.out.print("Introduce tu altura en metros(Ejemplo:1,80): ");
            double altura = scanner.nextDouble();

            System.out.print("Hola, ");
            System.out.println(nombre + "! Bienvenido.");

            System.out.printf("Tienes %d años y mides %.2f metros.%n", edad, altura);

            double numeroGrande = 123456789.12345;
            System.out.printf("El número en notación científica es: %e%n", numeroGrande);

            char inicial = nombre.charAt(0);
            System.out.printf("Tu inicial es '%c'. Tu nombre es %s y tu edad es %d años.%n", inicial, nombre, edad);

            if (edad < 0) {
                System.err.println("Edad introducida incorrecta");
            }

        } catch (InputMismatchException e) {
            System.err.println("Datos no válidos, porfavor introduce los números correctamente.");
        } finally {

            scanner.close();
        }
    }
}
