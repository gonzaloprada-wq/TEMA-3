package Arrays2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int ar [] = new int [1000];
		
		int contNum =0;
		
		int num;
		
		Scanner reader = new Scanner(System.in);
		
		Random rand = new Random();
		
		for(int i=0; i<ar.length; i++) {
			
			ar[i]=rand.nextInt(100);
			
		}
		
		System.out.println("Ingresa numero para buscar (0-99)");
		
		num=reader.nextInt();
		
		for(int i=0; i<ar.length; i++) {
			
		if(ar[i]==num) {contNum++;}	
			
		}
		
		if(contNum==0) {System.out.println("No tiene dicho numero dentro del array");}
		else {System.out.println("Ese numero se encuentra en el array "+contNum+" veces.");}
		
	}

}
