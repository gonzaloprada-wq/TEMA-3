package ArraysBi;

public class Ejercicio4 {

	public static void main(String[] args) {

		int tablaMul[][]=new int [10][10];
	
		for(int i=0;i<tablaMul.length;i++){
			
			for(int j=0; j<tablaMul.length;j++){
				
				tablaMul[i][j]=(i+1)*(j+1);
				
				System.out.print(tablaMul[i][j]+" ");
				
			}
			System.out.println();
		}
	
	}
}
