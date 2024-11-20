package com.Paula.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;

public class UtilidadesFechas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo 1: Calcular la edad
        
        System.out.print("Introduce tu fecha de nacimiento (formato: dd/MM/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = parsearFechaAFormatoLocalDate(fechaNacimientoStr, "dd/MM/yyyy");
        int edad = calcularEdad(fechaNacimiento);
        System.out.println("Edad: " + edad);

        // Ejemplo 2: Obtener el nombre del mes
        
        System.out.print("Introduce un mes (1-12): ");
        int mes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        String mesNombre = obtenerMes(mes);
        System.out.println("Mes: " + mesNombre);

        // Ejemplo 3: Parsear una fecha
        
        System.out.print("Introduce una fecha de hoy (formato: dd/MM/yyyy): ");
        String fechaStr = scanner.nextLine();
        Object[] fechaParseada = parsearFecha(fechaStr, "dd/MM/yyyy");
        System.out.println("Date: " + fechaParseada[0]);
        System.out.println("Calendar: " + ((Calendar) fechaParseada[1]).getTime());
        System.out.println("LocalDate: " + fechaParseada[2]);
        System.out.println("LocalTime: " + fechaParseada[3]);

        // Ejemplo 4: Comprobar una fecha válida
        
        System.out.print("Introduce una fecha para comprobar si es válida (formato: dd/MM/yyyy): ");
        String fechaComprobar = scanner.nextLine();
        boolean esFechaValida = compruebaFecha(fechaComprobar, "dd/MM/yyyy");
        System.out.println("¿Es válida la fecha " + fechaComprobar + "? " + esFechaValida);
        
        // Ejemplo 5: Comprobar una fecha inválida
        
        System.out.print("Ingresa otra fecha para comprobar si es inválida (formato: dd/MM/yyyy): ");
        String fechaInvalida = scanner.nextLine();
        boolean esFechaInvalida = compruebaFecha(fechaInvalida, "dd/MM/yyyy");
        System.out.println("¿Es válida la fecha " + fechaInvalida + "? " + esFechaInvalida);
        
        scanner.close();
    }

    // Método para calcular la edad basada en una fecha de nacimiento
    
    public static int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate ahora = LocalDate.now();
        return Period.between(fechaNacimiento, ahora).getYears();
    }

    // Método para obtener el nombre del mes según el número del mes
    
    public static String obtenerMes(int mes) {
        if (mes < 1 || mes > 12) {
            return "Mes inválido";  // Retorna un mensaje si el número del mes no es válido
        }
        Month mesEnum = Month.of(mes);
        return mesEnum.getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

    // Método para parsear una fecha en diferentes formatos
    
    public static Object[] parsearFecha(String fecha, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        try {
            date = sdf.parse(fecha);
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        LocalDate localDate = LocalDate.parse(fecha, DateTimeFormatter.ofPattern(formato));
        LocalTime localTime = LocalTime.parse("00:00");  // Asumimos que la hora es las 00:00

        return new Object[]{date, calendar, localDate, localTime};
    }

    // Método para comprobar si una fecha es válida según un formato
    
    public static boolean compruebaFecha(String fecha, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        sdf.setLenient(false);
        try {
            sdf.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    // Método auxiliar para convertir un String a LocalDate
    
    public static LocalDate parsearFechaAFormatoLocalDate(String fecha, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return LocalDate.parse(fecha, formatter);
    }
}
