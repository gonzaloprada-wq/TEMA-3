package Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		
		int diezVeint []= new int [20];
		
		int veintDiez []= new int [20];
		
		Scanner reader = new Scanner(System.in);
			
		for(int i=0; i<diezVeint.length-10; i++) {
			
			System.out.println("Ingresa numero ");

			diezVeint [i] = reader.nextInt();
			
		}			
		
		for(int i=10; i<diezVeint.length; i++) {
			
			System.out.println("Ingresa numero ");

			veintDiez [i] = reader.nextInt();
			
		}
					
			System.out.println("Son Iguales: "+Arrays.equals(diezVeint, veintDiez));
			
		
		
	}
}
