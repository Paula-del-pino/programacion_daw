package unidad01;

import java.util.Scanner;

/*
 *  Escribe un programa que dada una hora determinada (horas y minutos), 
 *  calcule los segundos que faltan para llegar a la medianoche
 */
public class ParaMediaNoche {

	public static void main(String[] args) {
		// Declaración del objeto Scanner 
		Scanner scan = new Scanner(System.in);
		// Con enteros
	//	System.out.print("Introduce la hora actual:");
	//	int hora = scan.nextInt();
	//	System.out.print("\nIntroduce los minutos actuales:");
	//	int minutos = scan.nextInt();
		// Con manejo de cadenas
		System.out.println("Introduce la hora actual con formato HH:");
		String horaString =  scan.nextLine();
		//22:13
		int hora = Integer.parseInt(horaString.substring(0, 2));
		int minutos = Integer.parseInt(horaString.substring(3, 5));
		//TODO: controlar los datos erróneos
		int horasParaMediaNoche =(23 - hora);
		int minutosParaMediaNoche =(60 - minutos)*60;
		int segParaMediaNoche = horasParaMediaNoche * 3600 +  minutosParaMediaNoche*60;
		System.out.println("\nQuedan " + segParaMediaNoche + " segundos para medianoche." );
		scan.close();
	}

}
