package Funciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2_2 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Como de alto/ancho sera la tabla bidimensional ");
		
		int anchoAlto=reader.nextInt();
		
		
		int [][] bidimensional=new int [anchoAlto][anchoAlto];
		
		for(int i=0; i<anchoAlto;i++){
			for(int j=0;j<bidimensional.length;j++){
		
			bidimensional[j][i]=rand.nextInt(9)+1;
			
			}	
		}
		for(int i=0; i<anchoAlto;i++){
			for(int j=0;j<bidimensional.length;j++){
		
			System.out.print(bidimensional[j][i]);
			System.out.print(" | ");
			}
			System.out.println();
			System.out.println(" ");
		}
		
		System.out.println("Tabla invertida: ");
		
		bidimensional=tInverted(bidimensional);
		
		for(int i=0; i<anchoAlto;i++){
			for(int j=0;j<bidimensional.length;j++){
		
			System.out.print(bidimensional[j][i]);
			System.out.print(" | ");
			}
			System.out.println();
			System.out.println(" ");
		}
		
	}
	
	public static int[][] tInverted(int [][]t){
		
		int largoAncho=t.length;
		
		int inverted[][]=new int[largoAncho][largoAncho];
		
		for(int i=0; i<t.length;i++){
			for(int j=0;j<t.length;j++){
				
			inverted[i][j]=t[j][i];
				
			}
				
		}
		
		
		
		return inverted;	
	} 
	
	
	
}
