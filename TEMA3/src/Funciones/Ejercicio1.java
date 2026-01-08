package Funciones;

public class Ejercicio1 {

	public static void main(String[] args) {

	int tabla [] = new int[] {1, 4, 5, 5, 7,100};
		
	System.out.println(sumaDeTabla(tabla));
	
	}

	public static int sumaDeTabla(int[] suma) {
		
	int aux=0;
		
	for(int i=0; i<suma.length;i++) {
		
		aux+= suma[i];
	}
		
		return aux;
		
		
	}
	
}
	

