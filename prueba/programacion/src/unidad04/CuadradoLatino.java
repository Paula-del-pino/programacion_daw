package unidad04;

/**
 * Crear un cuadrado latino en Java
 * 
 * Un cuadrado latino de orden N es una matriz cuadrada de N filas y N columnas
 * en la que su primera fila contiene los N primeros números naturales y cada
 * una de las filas siguientes contiene la rotación de la fila anterior un lugar
 * a la derecha.
 * 
 * Por ejemplo, un cuadrado latino de orden 4 es una matriz cuadrada de tamaño 4
 * x 4 con el siguiente contenido:
 *
 * 
 * 1 2 3 4
 * 4 1 2 3
 * 3 4 1 2
 * 2 3 4 1
 */
public class CuadradoLatino {

	public static void main(String[] args) {
		System.out.println("Vamos a crear un cuadrado latino, introduce la dimensión del cuadrado: ");
		int n = 4;
		int[][] CuadradoLatino = GenerarCuadrado(n);
		
		for(int i = 0; i<n;i++) {
			for(int j =0;j<n;j++) {

				System.out.print(CuadradoLatino[i][j] + " ");
				
			}
			System.out.println();
		}

	}
	/**
	 * @param n el orden del cuadrado latino
     * @return una matriz cuadrada que representa el cuadrado latino
     */
	 public static int[][] GenerarCuadrado(int n){
		 
		 int[][] CuadradoLatino = new int[n][n];
		 for(int i = 0; i<n;i++) {
			 for(int j =0;j<n;j++) {
				 CuadradoLatino[i][j] = (i + j) % n + 1;
			 }
		 }
		 return CuadradoLatino;
	 }

}