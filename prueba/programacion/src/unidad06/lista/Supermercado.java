package unidad06.lista;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Supermercado {

	public static void main(String[] args) {
		Map<String, Double> productos = new HashMap<String, Double>();
		productos.put("avena", 2.21d);
		productos.put("garbanzos", 2.39d);
		productos.put("tomate", 1.59d);
		productos.put("jengibre", 3.13d);
		productos.put("quinoa", 4.5d);
		productos.put("guisantes", 1.6d);
		mostrarProductos(productos);
		Map<String, Integer> productosComprados = efectuaCompra(productos);
		mostrarFactura(productos, productosComprados);
	}

	private static void mostrarFactura(Map<String, Double> productos, Map<String, Integer> productosComprados) {
		Double total = 0d;
		System.out.println("""
				FACTURA
				Producto Precio Cantidad Subtotal
				---------------------------------
								""");
		for (String producto : productosComprados.keySet()) {
	        Integer cantidad = productosComprados.get(producto);
	        Double precio = productos.get(producto);
	        Double subtotal = precio * cantidad;
	        total += subtotal;
	        String subtotalStr= String.format("%.2f", producto);
	        System.out.println(producto + " " + precio + " " + cantidad + " " + subtotal);
	    }
				
				
		System.out.println("---------------------------------");
		System.out.printf("Total: %.2f", total);

	}

	private static Map<String, Integer> efectuaCompra(Map<String, Double> productos) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> productosComprados = new HashMap<String, Integer>();
		// bucle compras
		boolean fin = false;
		do {
			System.out.println("Producto (FIN para terminar):");
			String producto = scanner.nextLine();
			if (!"FIN".equalsIgnoreCase(producto)) {
				if (productos.containsKey(producto)) {
					System.out.println("Cantidad:");
					Integer cantidad = Integer.parseInt(scanner.nextLine());
				
					int cantidadAct = 0;
					if (productosComprados.containsKey(producto)) {
						cantidadAct = productosComprados.get(producto);
					}
					productosComprados.put(producto, cantidadAct + cantidad);
				} else {
					System.err.println("El producto" + producto + "no está disponible en el supermercado");
				}

			} else {
				fin = true;
			}

		} while (!fin);
		return productosComprados;
	}

	private static void mostrarProductos(Map<String, Double> productos) {
		for (String nombreProd : productos.keySet()) {
			Double precioProd = productos.get(nombreProd);
			System.out.println(nombreProd + " --> " + precioProd + " €");
		}

	}

}