package Strings;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingresa frase: ");
		
		String frase=reader.nextLine();
		
		System.out.println("Tiene "+(numerosEspacios(frase))+" espacios en blanco.");
		
	}

	
	public static int numerosEspacios(String frase) {
		
		int numerosDeChar=frase.length();
		
		int contadorEspacios=0;
		
		for(int i=0; i<numerosDeChar;i++) {
			
			if(frase.charAt(i)==' '){
				
			contadorEspacios++;	
				
			}
			
		}
		
		
		
		
		return contadorEspacios;
	}
	
}
