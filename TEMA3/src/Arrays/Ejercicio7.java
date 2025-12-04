package Arrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int temp []= new int [12];
		
		Scanner reader = new Scanner(System.in);
		
		for(int i=0; i<12;i++) {
			
		System.out.print("Ingresa temperatura para el mes "+(i+1+": "));
				
		temp[i]= reader.nextInt();
							
		}
		
		for(int j=0; j<12;j++) {
			
		System.out.print("Temp mes "+(j+1)+": ");
		
			for(int k=0;k<100;k++) {
				
				if(k<=temp[j]){System.out.print("*");}
			}
		System.out.println();
		}
		
	}

}
