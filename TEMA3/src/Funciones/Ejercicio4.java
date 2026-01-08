package Funciones;

import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {

		int clave;
		
		int tamaño;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Como de largo quieres que sea la tabla: ");
		
		tamaño = reader.nextInt();
					
		int tabla[]= new int [tamaño];
		
		for (int i = 0; i<=tamaño-1; i++){
			
		System.out.println("Ingresa numero para posicion "+i+": ");
			
		tabla[i]=reader.nextInt();
		}
		
		System.out.println("Ingresa clave: ");
		
		clave = reader.nextInt();
		
		System.out.println("La clave se encuentra en la posicion mas cercana: "+ buscar(tabla, clave));
		
	}
	
	public static int buscar(int t[], int clave) {
		
		
		int posicion=-1;
		
		String resultado="";
		
		for(int i=0; i<t.length;i++) {
			
			if(t[i]==clave&&posicion==-1) {
				
				posicion=i;	
			}	
		}
				
		return posicion;
	}
}
