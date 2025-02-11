package Poo;

import java.util.Arrays;
import java.util.Random;

import Poo.Exception.DadoNoPermitidoException;

public class Dado {
	private static final int NUM_MAX_LANZ = 100;
	// Atributos
	private Short caras;
	//vamos a guardar el num de lanzamientos totales de todos los dados creados
	private static Long numDadosTotales = 0l;
	private static Long numLanzamientosLanzamientosTotales = 0l;
	private Long numLanzamientos;
	private Short[] ultimosLanzamientos;
	private Long[][] estadisticas;
	
	//Constructor
	public Dado(short caras) throws DadoNoPermitidoException {
		if(caras == 4 || caras == 6 || caras == 8 || caras == 12 || caras == 20 || caras == 100) {
				this.caras = caras;
		this.numLanzamientos = 0l;
		this.ultimosLanzamientos = new Short[NUM_MAX_LANZ];
		this.estadisticas = new Long[2][caras];
		for (int i = 0;i <= caras ; i++) {
			this.estadisticas[0][i] = (long)i;
			this.estadisticas[1][i] = 0l;
		}
	this.numDadosTotales++;
		} else {
			throw new DadoNoPermitidoException("Número inválido de caras. Se permiten 4, 6 , 8 ,12 ,14, 20, 100");
		}
		
	}
	//Metodos heredados 
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Dado de ").append(this.caras).append(" caras.\n");
			sb.append("Se ha lanzado ").append(this.numLanzamientos).append(" veces.\n");
			sb.append("Estadisticas:\n");
			sb.append(this.getEstadisticas());
			return sb.toString();
		}
	// Metodos de instancia
	private  String getEstadisticas() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i < 2;i++) {
			for(int j = 0; j <this.caras; j++) {
				sb.append(this.estadisticas[i][j]).append("\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void mostrarEstadisticas() {
		System.out.println("Estadisticas" + getEstadisticas());
	}
	
	public Short lanzar() {
		Short resultado = (short) (Math.random() * this.caras + 1);
		numLanzamientosLanzamientosTotales++;
		this.numLanzamientos++;
		for(int i = ultimosLanzamientos.length - 1; i > 0;i--) {
			this.ultimosLanzamientos[i] = this.ultimosLanzamientos[i - 1];
		}
		this.ultimosLanzamientos[0] = resultado;
		this.estadisticas[1][resultado - 1]++;
		return resultado;
	} 
	
	public Short[] getUltimosLanzamientos(int numLanzamientos) {
		Short[] ultimosLanzamientos =  Arrays.copyOf(this.ultimosLanzamientos, numLanzamientos);
		return ultimosLanzamientos;
	}
}
