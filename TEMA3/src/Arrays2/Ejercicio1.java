package Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tamaño;
		
		int valor=0;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingresa tamaño: ");
		
		tamaño=reader.nextInt();
		
		System.out.println("Ingresa valor: ");
		
		valor=reader.nextInt();
		
		int tabla[]= new int[tamaño];
		
		for(int i=0; i<tabla.length;i++) {
			
			tabla[i]=valor;
			
		}
		
		System.out.println(Arrays.toString(tabla));
		
}
}
