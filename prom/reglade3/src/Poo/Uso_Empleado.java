package Poo;

import java.util.GregorianCalendar;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1=new Empleado("Paula Del Pino" , 85000 , 1990 , 12 , 17);
			
		Empleado empleado2=new Empleado("Ana López",95000, 1990, 06, 02);
		
		Empleado empleado3=new Empleado ("Maria Martín" , 105000,2002, 3, 15);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre : " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
		+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre : " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+ " Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre : " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+ " Fecha de Alta: " + empleado3.dameFechaContrato());
		
	}

}


class Empleado{
	
	public Empleado(String nom, double sue, int anio, int mes ,int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(anio,mes-1,dia);
		
		altaContrato=calendario.getTime();
	}
	
	public String dameNombre() { //GETTER
		
		return nombre;
	}
	
	public double dameSueldo() { //GETTER
		
		return sueldo;
	}
	
	public Date dameFechaContrato() { //GETTER
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
}   
