package Arrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int num[]= new int[8];
		
		Scanner reader = new Scanner(System.in);
		
		for(int i=0; i<num.length;i++) {
			
			System.out.print("Ingresa el siguiente numero: ");
			
			num[i]=reader.nextInt();
			
		}
		
		for(int i=0;i<num.length;i++) {
			
		if(num[i]%2==0) {System.out.print(num[i]+" es par; ");}
		else {System.out.print(num[i]+" es impar; ");}
				
		}
		
		
		
		
	}
}
