package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		double table[]=new double[10];
			
		Scanner reader = new Scanner(System.in);
		
			
			for(int i = 0; i<table.length; i++) {
				
			System.out.print("Ingresa número: ");
				
				table[i]=reader.nextDouble();
					
			}
			
			for(int i = table.length-1; i>=0; i--) {
				
				System.out.print(table[i]+" ");
				
			}
			
	}

}
