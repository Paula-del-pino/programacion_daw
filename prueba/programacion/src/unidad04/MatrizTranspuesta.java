package unidad04;

import java.util.Scanner;

public class MatrizTranspuesta {
	/**
	 * Dada una matriz A su transpuesta AT se obtiene intercambiando las filas por columnas y las columnas por filas. 
	 * Por ejemplo, si tenemos la matriz A de 2 filas y 4 columnas:
	 * 1  2  3  4
	 * 5  6  7  8
	 * Su matriz transpuesta AT es una matriz de 4 filas y 2 columnas con este contenido: 
	 *   1  5
	 *   2  6
	 *   3  7
	 *   4  8
	 *   La primera fila de A se convierte en la primera columna de la matriz transpuesta y la segunda fila de A se convierte en la segunda columna de la matriz transpuesta.
	 *   Si la dimensión de la matriz A es 2 x 3 (2 filas y 3 columnas) la dimensión de su matriz transpuesta será 3 x 2 (3 filas y 2 columnas).
	 *   Es decir, si la matriz A se ha creado de tamaño A[filas][columnas] su matriz transpuesta se debe crear de tamaño AT[columnas][filas]

	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce los valores de la matriz para obtener la transpuesta: ");
		System.out.println("Introduce el número de filas: ");
		int filas = scanner.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int cols = scanner.nextInt();
		int[][] matriz = new int[filas][cols];
		//inicializar la matriz con los datos
		 for (int i = 0; i < matriz.length; i++) {
		    	  for (int j = 0; j < matriz.length; j++) {
		    		  System.out.printf("introduce el valor para la posición: ");
			    	  matriz[i][j] = scanner.nextInt();
		    	  }
			 }
		System.out.println("Matriz Inicial");
		mostrarMatriz(matriz);
		int[][]matrizT = obtenerMatrizTranspuesta(matriz);
		System.out.println();
		mostrarMatriz(matriz);
		
	}
	 private static int[][]obtenerMatrizTranspuesta(int[][] matriz) {
		 int[][]matrizT = new int[matriz[0].length][matriz.length];
		 for(int i = 0; i < matrizT.length; i++);{
		 		for(int j = 0; j < matrizT.length; j++);{
		 		
		 		}
		 	}
		  return matrizT;
	 }
	 
	 private static void mostrarMatriz(int[][] matriz) {
		 	for(int i = 0;i < matriz.length;i++);{
		 		for(int j = 0;j<matriz.length;j++);
		
		 	}
		 System.out.println("\n");
	 	}
	}
