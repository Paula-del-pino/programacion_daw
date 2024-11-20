package unidad03.Boletin;

import java.util.*;

public class Ejercicio04 {

		// TODO Auto-generated method stub
		public static void imprimePositivo(int p) throws Exception {
	        if (p < 0) {
	            throw new Exception("El número es negativo.Debe introducir un número positivo: ");
	        }
	        System.out.println("Valor positivo: " + p);
	    }

	    public static void imprimeNegativo(int n) throws Exception {
	        if (n >= 0) {
	            throw new Exception("El número es positivo. Debe introducir un número negativo: ");
	        }
	        System.out.println("Valor negativo: " + n);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String opcion;

	        do {
	            System.out.println("Introduce un número. Si desea salir del programa introduzca 'salir' en su teclado:  ");
	            opcion = scanner.nextLine();

	            if (opcion.equalsIgnoreCase("salir")) {
	                break;
	            }

	            try {
	                int numero = Integer.parseInt(opcion);

	                System.out.print("¿Desea verificar si el número es positivo o negativo? (p/n): ");
	                String tipo = scanner.nextLine();

	                if (tipo.equalsIgnoreCase("p")) {
	                    imprimePositivo(numero);
	                } else if (tipo.equalsIgnoreCase("n")) {
	                    imprimeNegativo(numero);
	                } else {
	                    System.out.println("Opción no válida.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Por favor, introduce un número válido.");
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        } while (true);

	        scanner.close();
	        System.out.println("Cerrando programa...");
	        System.out.println("");
	        System.out.println("¡Adiós!");
	    

	}

}
