package unidad06.lista;

import java.util.ArrayList; 
import java.util.Scanner;

public class TestLista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Coleccion coleccion = new Coleccion();
		boolean seguir = true;
		System.out.println("Introduce los productos de la colección.");
		System.out.println("Formato: codigo nombreProd tipoProd precio(00.0) existencias");
		System.out.println("introducir 0 para terminar");
		while(seguir) {
			int codigo = Integer.parseInt(scan.next());
			if(codigo != 0) {
				String nombre = scan.next();
				String tipo = scan.next();
				double precio = Double.parseDouble(scan.next());
				int existencias = Integer.parseInt(scan.next());
				Producto prod = new Producto(codigo,nombre,tipo,precio,existencias); 
				System.out.println(prod);
			} else {
				seguir = false;
			}
		}
	}
}
