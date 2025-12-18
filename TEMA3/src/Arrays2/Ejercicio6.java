package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int ganadora []={5, 12, 18, 19, 29, 49};
		
		int loteria []= new int [6];
		
		int contGan=0;
		
		Random rand = new Random();
		
		for (int i=0; i<loteria.length; i++) {
			
		 loteria[i]=rand.nextInt(49)+1;	
			
		}
		
		
		for (int i=0; i<ganadora.length; i++) {
			
			for(int j=0; i<loteria.length;i++) {
				
				if (ganadora[i]==loteria[j]){
					
					contGan++;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(loteria));
		System.out.println("Hay "+contGan+ " numero/s ganadores.");
		
		
	}

}
