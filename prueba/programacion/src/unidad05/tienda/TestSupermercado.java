package unidad05.tienda;

import java.util.Scanner;

public class TestSupermercado {

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del cliente:");
		Scanner scanner = new Scanner(System.in);
		String cliente = scanner.nextLine();
		ProductoUnitario pu1 = new ProductoUnitario("Leche", "Productos Lácteos y huevos", 6, 0.8d);
		ProductoUnitario pu2 = new ProductoUnitario("Docena de huevos", "Productos Lácteos y huevos", 12, 1.25d);
		ProductoUnitario[] products = new ProductoUnitario[2];
		products[0] = pu1;
		products[1] = pu2;
		"".equals("");
		double importeTotal = 0d;
		System.out.println("TICKET DE LA COMPRA \t Cliente: " + cliente + "\t Nombre del producto:" );
		for (ProductoUnitario productoUnitario : products) {
			importeTotal += productoUnitario.getImporteTotal();
			productoUnitario.imprimir();
		}
		System.out.println("Importe total \t\t\t\t ");
	}
} 
