package Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int puntDes [] = new int [8];
		
		int puntOrd [] = new int [8];
		
		int puntos;
		
		int cont = 0;
		
		Scanner reader = new Scanner(System.in);
		
		for(int i=0; i<puntDes.length;i++) {
			
			System.out.println("Ingresa puntos: (1000-2800)");
			
			puntos=reader.nextInt();
			
			  assert puntos >= 1000 && puntos <= 2800 :
                   
			  "La puntuación debe estar entre 1000 y 2800";
			  
			  puntDes[i]=puntos;
		}
		
			Arrays.sort(puntDes);
		
		for(int i=puntDes.length-1; i>=0; i--) {
			
			puntOrd[cont]=puntDes[i];
			
			cont++;
			
		}
		
		System.out.print(Arrays.toString(puntOrd));
		
	}

}
