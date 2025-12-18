package ArraysBi;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		int tabla[][]= new int [4][5];
		
		Random rand= new Random();
		
		for(int i=0; i<tabla.length; i++){
			for(int j=0; j<tabla.length; j++) {
			
			 tabla[i][j]=rand.nextInt(900)+100;
				
			}
		}
		
		
		
		
	}
}
