package ArraysBi;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int aux=0;
		
		Scanner reader = new Scanner(System.in);
		
		int notas [][] = new int [4][5];
		
		for (int i=0; i<notas.length; i++){
			
			for(int j=0; j<5;j++) {
						
			System.out.print("Ingresa nota numero "+ (j+1)+" del alumno "+(i+1)+": (0-10) ");
			
			notas[i][j]=reader.nextInt();
			
			if(notas[i][j]>10) {System.out.println("Sobrepasa el 10, se convertira en 10"); notas[i][j]=10;}
			if(notas[i][j]<0) {System.out.println("Es inferior a 0, se convertira en 0"); notas[i][j]=0;}
			}
			
			Arrays.sort(notas[i]);			
			}
		
			for(int i=0; i<notas.length; i++){
				System.out.println();
				System.out.println("NOTAS DE ALUMNO "+(i+1)+": ");
				
			for(int j=0; j<notas.length;j++) {	
				
				aux+=notas[i][j];
				
			}
			
			System.out.println();
			System.out.println("Nota maxima: "+(notas[i][4]));
			System.out.println();
			System.out.println("Nota mas pequeña: "+(notas[i][0]));	
			System.out.println();
			System.out.println("Nota media: "+(aux/5));
			}
		
		
	}
}
