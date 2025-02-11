package Poo;

import java.util.Scanner;

public class UsoBombilla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bombilla bombillaOsram = new Bombilla("Osram", 60f, 47.5f, "apagada");
		System.out.println(bombillaOsram);
		bombillaOsram.encender();
		
		Bombilla bombillaPorDefecto = new Bombilla("Korean", 12f, 0f, "encendida");
		System.out.println(bombillaPorDefecto);
		
		Bombilla bombillaEncendida = new Bombilla("Phillips", 15.5f, 5f, "endendida");
		System.out.println(bombillaEncendida);
		
		Bombilla bombilla2 = new Bombilla("Huawei", 10.5f, 10f, "apagada");
		System.out.println(bombilla2);
		
		if(bombillaOsram.equals(bombilla2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintas");
		}
	}

}
