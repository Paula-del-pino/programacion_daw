package unidad07.boletin;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej01 {
    public static void main(String[] args) {
        final String rutaFichero = "ficheros/miArchivo.txt";
        File carpeta = new File("ficheros");

        if (!carpeta.exists()) {
            if (carpeta.mkdirs()) {
                System.out.println("Carpeta 'ficheros' creada correctamente.");
            } else {
                System.err.println("No se pudo crear la carpeta 'ficheros'.");
                return;
            }
        }

        try (FileWriter writer = new FileWriter(rutaFichero)) {
            writer.write("Esto es una prueba"); 
            System.out.println("Fichero creado y contenido escrito con éxito.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el fichero: " + e.getMessage());
            return;
        }


        try (FileReader reader = new FileReader(new File(rutaFichero))) {
            int caracter;
            StringBuilder contenidoSinEspacios = new StringBuilder();

            while ((caracter = reader.read()) != -1) {
                if (!Character.isWhitespace(caracter)) { 
                    contenidoSinEspacios.append((char) caracter);
                }
            }

            System.out.println("Contenido del fichero sin espacios:");
            System.out.println(contenidoSinEspacios.toString());
        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
