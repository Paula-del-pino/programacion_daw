package unidad07.boletin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Ej03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Introduce el fichero del que quieres leer");
		final String rutaEntrada1 = "ficheros/" + "A.txt";
		//System.out.println("Introduce el fichero del que quieres leer");
		final String rutaEntrada2 = "ficheros/" + "1.txt";
		String nombreSalida= "";
		int posPunto1 = StringUtils.lastIndexOf(rutaEntrada1, ".");
		int posPunto2 = StringUtils.lastIndexOf(rutaEntrada2, ".");
		int posBarra1 = StringUtils.lastIndexOf(rutaEntrada1, "/");
		int posBarra2 = StringUtils.lastIndexOf(rutaEntrada2, "/");
		String ext1 = StringUtils.substring(rutaEntrada1, posPunto1);
		String ext2 = StringUtils.substring(rutaEntrada2, posPunto2);
		if (StringUtils.equalsIgnoreCase(ext1, ext2)) {
			System.out.println("son iguales");
			// System.out.println(StringUtils.substring(rutaEntrada1, posBarra1 +1, posPunto1));
			String file1 = StringUtils.substring(rutaEntrada2, posBarra2 + 1, posPunto1);
			// System.out.println(StringUtils.substring(rutaEntrada2, posBarra2 +1, posPunto2));
			String file2 = StringUtils.substring(rutaEntrada2, posBarra2 + 1, posPunto2);
			nombreSalida = file1 + "-" + file2 + "_copia" + ext1;
			System.out.println("nombre salida: " + nombreSalida);
			final String rutaSalida = "ficheros/" + scan.nextLine();
			File fileOut = new File(rutaSalida);
			File fileIn1 = new File(rutaEntrada1);
			File fileIn2 = new File(rutaEntrada2);
			
			try {
				FileReader fr1 = new FileReader(fileIn1);
				FileReader fr2 = new FileReader(fileIn2);
				FileWriter fw = new FileWriter(fileOut);
				int caracterValue = fr1.read();
				int caracterValue2 = fr2.read();
				while (caracterValue != -1) {
					Character character = Character.valueOf((char)caracterValue);
					if(Character.isUpperCase(character)) {
						character = Character.toLowerCase(character);
					} else {
						character = Character.toUpperCase(character);
					}
					caracterValue = fr1.read();
					caracterValue2 = fr2.read();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e){
				
			}
		} else {
			System.err.println("Los ficheros no son compatibles");
		}
		
	}

}