package Funciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1_2 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int tabla[][]= new int[6][10];
		
		for(int i=0; i<tabla.length;i++){
			for(int j=0; j<tabla[i].length;j++){
				
			tabla[i][j]=rand.nextInt(1001);
			}
		}
		
		int[] mayMen= mayorMenor(tabla);
		
		System.out.println(Arrays.toString(mayMen));
	}

	public static int[] mayorMenor(int[][] t){
		
		int mayMen[]=new int [2];
		
		int auxMay=-999999999;
		
		int auxMen=999999999;
		
		for(int i=0; i<t.length;i++){
			for(int j=0; j<t[i].length;j++){
				
				if(t[i][j]>auxMay) {auxMay=t[i][j];}
				
				if(t[i][j]<auxMen) {auxMen=t[i][j];}
				
				}
			}
		
		mayMen[1]=auxMay;
		mayMen[0]=auxMen;
		
		return mayMen;
	}
	
	
}
