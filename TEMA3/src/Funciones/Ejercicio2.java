package Funciones;

public class Ejercicio2 {

	public static void main(String[] args) {

		int t[]=new int[] {1,65,32,78,343};	
		
		System.out.println(maximo(t));
		
	}
	public static int maximo(int[] aux) {
		
		int auxMax=-999999999;
		
		for(int i=0; i<aux.length;i++) {
			
			if(aux[i]>auxMax) {
				auxMax=aux[i];
			}
		}
		
		return  auxMax;
	}
}
