package com.Paula.tarea2;

import java.util.Scanner;

public class UtilidadesMatematicas {

    // Ejercicio h) posicionDeDigito
	
    public static int posicionDeDigito(int numero, int digito) {
        int posicion = 0;
        int numeroInvertido = invertirNumero(numero);

        while (numeroInvertido > 0) {
            if (numeroInvertido % 10 == digito) {
                return posicion;
            }
            numeroInvertido /= 10;
            posicion++;
        }

        return -1;
    }

    // Ejercicio m) trozoDeNumero
    
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        int longitud = contarDigitos(numero);
        numero = invertirNumero(numero);
        int resultado = 0;

        for (int i = 0; i < longitud; i++) {
            int digito = numero % 10;
            if (i >= inicio && i <= fin) {
                resultado = resultado * 10 + digito;
            }
            numero /= 10;
        }

        return invertirNumero(resultado);
    }

    // Ejercicio n) juntaNumeros
    
    public static int juntaNumeros(int numero1, int numero2) {
        int multiplicador = 1;

        while (multiplicador <= numero2) {
            multiplicador *= 10;
        }

        return numero1 * multiplicador + numero2;
    }

    // Ejercicio s) factorial
    
    public static long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }

        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    // Ejercicio t) cambioExacto
    
    public static boolean cambioExacto(int cantidad) {
        for (int monedasDe5 = 0; monedasDe5 * 5 <= cantidad; monedasDe5++) {
            int resto = cantidad - monedasDe5 * 5;
            if (resto % 2 == 0) {
                return true;
            }
        }

        return false;
    }

    // Métodos auxiliares

    /**
     * Invierte un número entero.
     */
    private static int invertirNumero(int numero) {
        int invertido = 0;

        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }

        return invertido;
    }

    /**
     * Cuenta el número de dígitos de un número.
     */
    private static int contarDigitos(int numero) {
        int contador = 0;

        do {
            contador++;
            numero /= 10;
        } while (numero > 0);

        return contador;
    }

    // Método main 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prueba del método posicionDeDigito
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.print("Introduce el dígito a buscar: ");
        int digito = scanner.nextInt();
        System.out.println("La posición del dígito es: " + posicionDeDigito(numero, digito));

        // Prueba del método trozoDeNumero
        
        System.out.print("Introduce el número para extraer el trozo: ");
        numero = scanner.nextInt();
        System.out.print("Introduce la posición inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Introduce la posición final: ");
        int fin = scanner.nextInt();
        System.out.println("El trozo del número es: " + trozoDeNumero(numero, inicio, fin));

        // Prueba del método juntaNumeros
        
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("El número combinado es: " + juntaNumeros(numero1, numero2));

        // Prueba del método factorial
        
        System.out.print("Introduce un número para calcular su factorial: ");
        int numFactorial = scanner.nextInt();
        System.out.println("El factorial es: " + factorial(numFactorial));

        // Prueba del método cambioExacto
        
        System.out.print("Introduce la cantidad para verificar si hay cambio exacto: ");
        int cantidad = scanner.nextInt();
        System.out.println("¿Hay cambio exacto? " + cambioExacto(cantidad));

        scanner.close();
    }
}
