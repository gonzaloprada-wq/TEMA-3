package Arrays;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		int table[]=new int[10];
		
		Random r = new Random();
		
		for(int i = 0; i<table.length; i++) {
			
			table[i]=r.nextInt(100)+1;
				
		}
		
		for(int i = 0; i<table.length; i++) {
			
			System.out.print(table[i]+" ");
			
		}
		
	}

}
