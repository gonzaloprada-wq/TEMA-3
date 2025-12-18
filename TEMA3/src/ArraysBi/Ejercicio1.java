package ArraysBi;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		int num [][] = {{00, 30, 02, 00, 00, 05},
						{75, 00, 00, 00, 00, 00},
						{00, 00, -2, 9, 00, 11},};
		
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<num[i].length;j++) {
				
				System.out.print(num[i][j]+" ");
	
			}
				System.out.println();
		}
		
		
	}
}
