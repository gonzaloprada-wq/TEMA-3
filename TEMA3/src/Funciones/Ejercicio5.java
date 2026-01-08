	package Funciones;
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class Ejercicio5 {
	
		public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
			
		int buscar;
		
		int tabla[] = {2, 3, 5, 3, 3};
			
		System.out.println("Ingresa valor: ");	
			
		buscar=reader.nextInt();
		
		System.out.println(Arrays.toString(buscarTodos(tabla, buscar)));
		}
		
		public static int[] buscarTodos(int t[], int valor) {
			
			int contador=0;
			
			for(int i = 0; i<t.length;i++) {
				
			if(t[i]==valor){
				
				contador++;	
			}	
			}
			
			int arrayFinal[] = new int[contador];
			
			if(contador>0){
		
			
			for(int i=0, j=0; i<t.length;i++) {
				
			if(t[i]==valor) {
				
				arrayFinal[j]=i;
				j++;
				
			}
			}

			
			}
			
			return arrayFinal;
			
			
		}
		
	}
