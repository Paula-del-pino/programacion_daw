package Poo;

import Poo.Exception.DadoNoPermitidoException;

public class UsoDado {

	public static void main(String[] args) {
		try {
			Dado dadoCuatro = new Dado((short) 4);
			System.out.println(dadoCuatro);
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			System.out.println(dadoCuatro);
			//dadoCuatro.getUltimosLanzamientos(10);
			for (Short lanz : dadoCuatro.getUltimosLanzamientos(10)) {
				System.out.println(lanz);
			}
		} catch (DadoNoPermitidoException e) {
			System.out.println(e.getMessage());
		}

	}

}
