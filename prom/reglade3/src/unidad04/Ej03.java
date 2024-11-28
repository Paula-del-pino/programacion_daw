package unidad04;

public class Ej03 {

	public static void main(String[] args) {
		
		int []numero = new int[20];
		int []cuadrado = new int[20];
		int []cubo = new int[20];
		
		for (int i = 0;i<numero.length;i++) {
		
			int aleatorio = (int) (Math.random()*101);
			numero[i]= aleatorio;
			cuadrado[i] = aleatorio * aleatorio;
			cubo[i] = (int) Math.pow(aleatorio, 3);
		} 
		
		for (int i = 0;i<numero.length;i++) {
			
			System.out.printf("%d\t%d\t%d\t\n" , numero[i] , cuadrado[i], cubo[i]);
		}

	}

}
