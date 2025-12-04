package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int localizar;
		
		Scanner reader= new Scanner(System.in);
		
		int num[]=new int[100];
		
		Random rand = new Random();
		
		for(int i=0; i<num.length; i++) {
			
			num[i]=rand.nextInt(10)+1;
			
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println();
			System.out.println("Ingresa numero para localizar: ");
			
			localizar = reader.nextInt();
			
			System.out.print("Esta en la posicion ");
			for (int j=0; j<num.length;j++) {
				
				if (localizar==num[j]){System.out.print(j+" ");}
				else if (j==num.length){System.out.println("No se encuentra ese numero");}
				
			}
		}
		
		
	}
}
