package unidad04;

import org.apache.commons.lang3.StringUtils;

public class MetodosApache {
	//Ejercicio 2
	/*
	* Metodo capitalize
	* Este método convierte la primera letra de una cadena a mayúscula.
	* String texto="hola mundo";
	* System.out.print(StringUtils.capitalize(texto));
	*/
	
	/*
	 * Metodo join
	 * Este método une los elementos de un array en una sola cadena, 
	 * String[] array = {"manzana", "naranja", "platano"};
	 * System.out.println(StringUtils.join(array, ", "));
	 */
	
	/*
	* Metodo reverse
	* Este método invierte el orden de los caracteres en una cadena
	* String texto="hola de nuevo";
	* System.out.print(StringUtils.reverse(texto));
	*/
	
	public static void main(String[] args) {
		
		        String texto1 = "hola";
		        String texto2 = "mundo";

		        // Convertir la primera letra de cada cadena a mayúscula
		        System.out.println(StringUtils.capitalize(texto1));
		        System.out.println(StringUtils.capitalize(texto2));
		        
		        // Unir las dos cadenas en una sola, separadas por un espacio
		        String[] array = {"manzana", "naranja", "platano"};
		        System.out.println(StringUtils.join(array, ", ")); // "manzana, naranja, platano"
		        
		        // Invertir el orden de los caracteres en una cadena
		        System.out.println(StringUtils.reverse(texto1));
		        System.out.println(StringUtils.reverse(texto2));
		    }
}
