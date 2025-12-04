package Arrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		double table[]=new double[10];
		
		Scanner reader = new Scanner(System.in);
		
		double auxSum=0;
		
		double auxMayor=-999999999;
		
		double auxMenor=999999999;
		
			
			for(int i = 0; i<table.length; i++) {
				
			System.out.print("Ingresa número: ");
				
				table[i]=reader.nextDouble();
					
			}
			
			for(int i = table.length-1; i>=0; i--) {
				
				auxSum+=table[i];
				
				if(table[i]>=auxMayor) {
				
				auxMayor=table[i];
	
				}
				if(table[i]<auxMenor) {
					
				auxMenor=table[i];
					
				}
			}
		System.out.println(auxSum);
		System.out.println(auxMenor+" es el menor.");
		System.out.println(auxMayor+" es el mayor.");
		
	}

}
