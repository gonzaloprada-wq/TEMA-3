package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {

		int ar [] = new int [30];
		
		
		Random rand = new Random();
		
		for (int i=0; i<30; i++) {
			
		ar[i]=rand.nextInt(10);
			
		}
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
			
			
			
	}
}
