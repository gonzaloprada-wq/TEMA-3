package Funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	
	int cantidadNum;
	
	int tamaño;
	
	System.out.print("Ingresa cuantos numeros van a tener el array: ");
	
	tamaño = reader.nextInt();
	
	System.out.print("Ingresa cuantos numeros van a agruparse el array: ");
	
	int agrupacion = reader.nextInt();
	
	int nuevoArray[] = new int [tamaño];
	
	for (int i=0; i<nuevoArray.length;i++){
		
		System.out.println("Ingresa numero para la posicion "+i);
		
		nuevoArray[i]=reader.nextInt();
		
	}
	
	System.out.println(Arrays.toString(suma(nuevoArray, agrupacion)));
	
	
	
	}

	public static int[] suma(int t[], int numElementos) {
		
		int longitud=t.length;
		
		int arrayFinal[] = new int [longitud-numElementos+1];
		
		int cantSumas=arrayFinal.length;
		
		int cont=0;
		
		int auxSuma=0;
		
		
		for(int i=0; i<cantSumas;i++){
			for(int j=cont; j<cont+numElementos; j++){
				
				auxSuma+=t[j];
		
			}
			
			arrayFinal[i]=auxSuma;
			
			auxSuma=0;
			
			cont++;
		}
		
			
		return arrayFinal;
	}
	
}
