package unidad07.boletin;
import java.util.*; 
import java.io.*;

public class Practica {

    private static Map<String, Float> productos = new HashMap<>();

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 productos.put("TOMATE", 8.6f);
		 productos.put("AVENA", 1.4f);
		 String ruta = "ficheros/miArchivoEj.txt";
		 try {
			 
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
			bw.write("Productos;Precio" + "\n");
			bw.write(productos.keySet() + ";" + productos.values());
			bw.close();
		} catch (IOException e) {
			System.out.println("No se encuentra este archivo");
			System.err.println(e.getMessage());
		}
		 
	}
}