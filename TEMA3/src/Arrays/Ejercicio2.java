package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

	double table[]=new double[5];
		
	Scanner reader = new Scanner(System.in);
	
		Random r = new Random();
		
		for(int i = 0; i<table.length; i++) {
			
		System.out.print("Ingresa número: ");
			
			table[i]=reader.nextDouble();
				
		}
		
		for(int i = 0; i<table.length; i++) {
			
			System.out.print(table[i]+" ");
			
		}
		
		
		
		
		
		
	}
}
