package Funciones;

import java.util.Scanner;


public class Ejercicio3_2 {

	public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
		
	System.out.print("Ingresa como de grande quieres que sea el array bidimensional: ");
	
	int tamaño=reader.nextInt();
		
	int [][] bidimensional=new int [tamaño][tamaño];
	
	for(int i=0; i<bidimensional.length; i++) {
		for(int j=0; j<bidimensional.length;j++){
		
			System.out.print("Ingresa numero para posicion "+ i +" | "+ j+": ");
			
			bidimensional[j][i]=reader.nextInt();
		}	
	}

	System.out.print("Es un array simetrico: ");
	System.out.print(simetrica(bidimensional));
	
	}
		
	public static boolean simetrica(int [][]t){
		
		boolean esSimetrica=true;
		
		for(int i=0; i<t.length; i++) {
			for(int j=0; j<t.length;j++){
			
			if(t[j][i]!=t[i][j])
			
			{esSimetrica=false;
			break;}
				
			}	
		}
		
		return esSimetrica;		
	}
	
}
