package unidad03.Boletin;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
    	
    	
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Escribe un texto para contar cuantas vocales tiene:");
    	
        String texto =scan.next();
        
        int contadorVocales = contarVocales(texto);
        System.out.println("Total de vocales: " + contadorVocales);
    }

    public static int contarVocales(String texto) {
    	
        int contador = 0;
     
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
      
            if ("aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
}
