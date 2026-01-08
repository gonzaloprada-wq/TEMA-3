package Funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
		
	int longitud;
	
	int cantidadAleatorio;
	
	System.out.println("Ingresa la longitud de la tabla");
		
	longitud = reader.nextInt();
	
	System.out.println("Ingresa el numero maximo a ingresar");
	
	cantidadAleatorio=reader.nextInt()-1;
	
	System.out.println(Arrays.toString(rellenaPares(longitud, cantidadAleatorio))) ;
	
	}
	
	public static int[] rellenaPares(int longitud, int fin) {
			
		Random rand = new Random();	
		
		int tabla []= new int[longitud];
		
		for(int i=0; i<longitud; i++){
			
		tabla[i]=rand.nextInt(fin)+2;
			
		}
		
		return tabla;	
	}
}
