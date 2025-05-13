package unidad07.boletin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el fichero del que quieres leer: ");
		final String rutaEntrada = "ficheros/" + scan.nextInt();
		System.out.println("Introduce el fichero en el quieres escribir: ");
		final String rutaSalida = "ficheros/" + scan.nextLine();
		File fileIn = new File(rutaEntrada);
		File fileOut = new File(rutaSalida);
		
		try {
			FileReader fr = new FileReader(fileIn);
			FileWriter fw = new FileWriter(fileOut);
			int caracterValue = fr.read();
			while (caracterValue != -1) {
				Character character = Character.valueOf((char)caracterValue);
				if(Character.isUpperCase(character)) {
					character = Character.toLowerCase(character);
				} else {
					character = Character.toUpperCase(character);
				}
				caracterValue = fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			
		}
	}

}
