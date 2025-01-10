package unidad03.Boletin;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe tu fecha de cumpleaños y te calcularé cuanto tiempo falta para cumplir años: ");
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		String input = scan.nextLine();
		if (input.length() !=10) {
			System.err.println("el formato intreoducido no es correcto, debes introducir de nuevo la fecha:");
		} else {
			try {
				Date fechaNacDate = sdf.parse(input);
				Calendar fechaAct = Calendar.getInstance();
				
				Calendar fechaNac = Calendar.getInstance();
				fechaNac.setTime(fechaNacDate);
				
				Calendar fechaCumple = fechaNac;
				fechaCumple.set(Calendar.YEAR, fechaAct.get(Calendar.YEAR));
				if (fechaCumple.before(fechaAct)) {
					fechaCumple.add(Calendar.YEAR, 1);
				} 
				
				long milis = fechaCumple.getTimeInMillis() - fechaAct.getTimeInMillis();
				int dias = (int)(milis / (1000l * 60 * 60 * 24 ));
				System.out.printf("Quedan %d días para tu próximo cumpleaños." , dias);
				String diaCumple = sdf.format(fechaNacDate.getTime());
				System.out.printf("tu próximo cumpleaños es el día %s", diaCumple);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		scan.close();
	}
		
}
