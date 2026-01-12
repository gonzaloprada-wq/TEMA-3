package Strings;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		
		System.out.print("Ingresa frase a inverir: ");
		
		String frase=reader.nextLine();
	
		System.out.println("La frase invertida es la siguiente: "+ (inverted(frase)));
		
	}
	
	
	public static String inverted(String frase){
		
		String fraseFinal = "";
		
		int longitudDeLaFrase=frase.length();
		
		for(int i=longitudDeLaFrase-1; i>=0;i--){
			
			
			
			fraseFinal+=frase.charAt(i);
			
		}
		
		return fraseFinal;
	}
	
	
}
