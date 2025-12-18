package ArraysBi;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int vertical;
	
		int horizontal;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingresa cuantos numeros en vertical: ");
		
		vertical=reader.nextInt();
		
		System.out.println("Ingresa cuantos numeros en horizontal: ");
		
		horizontal=reader.nextInt();
		
		int tabla [][] = new int [vertical][horizontal];
		
		for(int i=0; i<tabla.length;i++){
			for(int j=0; j<tabla.length;j++){
				
				tabla[i][j]=10*i+j; 
				System.out.print(tabla[i][j]+" ");			
				}
			System.out.println();		
		}
	}
}
