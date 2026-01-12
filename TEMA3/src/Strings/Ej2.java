package Strings;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		//Se crea escaner para guardar valores
		Scanner reader = new Scanner(System.in);

		//Creo un boolean para determinar si tiene espacios, por defecto lo dejo en false
		boolean tieneEspacio = false;

		//Tambien creo otro para determinar si son iguales
		boolean iguales = false;

		//Creo una contraseña para que el jugador 1 la ingrese
		String contraseña;

		//Imprimo el inicio del programa dando al bienvenida de este para determinar que el programa funciona
		System.out.println("BIENVENIDO A ADIVINA LA CONTRASEÑA\n");

		//Creo un string que usara el jugador 2 para adivinar la contraseña del jugador 1
		String adivinarContraseña;

		//creo un int que determina la longitud de la contraseña real, debido que luego lo necesitaremos
		int longContraseña;

		//lo mismo que longContraseña, pero de la contraseña que ingrese el jugador 2
		int longContraseñaAdivinar;

		
		do {

			//Determinamos si tiene espacios, al principio de cada bucle se determina si tiene espacios en
			//false, ya que tras cada bucle la contraseña cambia.
			tieneEspacio = false;

			//Pido mediante print la palabra sin espacios y la guardo en contraseña
			System.out.print("Jugador 1, ingresa la contraseña (una palabra sin espacios): ");
			contraseña = reader.nextLine();

			//hago que si tiene espacios tieneEspacios se vuelva true por concluyente el bucle
			//se vuelve a ejecutar, hasta que no ponga espacios
			if (contraseña.contains(" ")) {
				tieneEspacio = true;
				System.out.println("Ingresa una UNICA palabra \n");
			}

			//si tiene espacios se reinicia
		} while (tieneEspacio);

		//guardo longitud de contraseña real
		longContraseña = contraseña.length();

		
		
		do {
			//Imprimo en el bucle que le toca al jugador 2 y que ingrese contraseña a adivinar
			System.out.print("\nJugador 2, Ingresa la contraseña a adivinar (palabra unica): ");
			adivinarContraseña = reader.nextLine();

			//para que no haya margen de error hago que las dos contraseñas sean igual de largas
			longContraseñaAdivinar = adivinarContraseña.length();

			//para ello creo un if que determina que si contrasela reak es mas largo
			//se añaden la diferencia de leongituf en espacios a la contraseña
			if (longContraseña > longContraseñaAdivinar)
			{
				int espaciosContraseñaAdivinar = longContraseña - longContraseñaAdivinar;

				//para ello uso un for para que se añadan, esto es todo debido a que el for
				//que haremos mas tarde puede dar error si esto de aqui no se realiza, por 
				//diferencias de longitud.
				for (int i = 0; i < longContraseñaAdivinar; i++) {
					
					adivinarContraseña+=" ";
					
				}

			}

			//si la contraseña a adivinar es igual se convierte iguales en true, para que
			//el bucle termine dandole de ganador al jugador 2
			if (adivinarContraseña.equals(contraseña))

			{
				iguales = true;
			}

			//si esto no se da procederemos con el else
			else {

				//esto realiza una mensaje indicando que la contraseña es incorrecta
				System.out.println();
				System.out.println("Constraseña incorrecta \n");

				//creo un for para realizar el mensaje de vuelta, con asteriscos con los char incorrectos
				for (int i = 0; i < longContraseña; i++) {

					//este if determina si es correcta algun caracter e imprime ese mismo caracter en la misma posicion
					//para deternminar que es correcto
					if (contraseña.charAt(i) == adivinarContraseña.charAt(i)) {
						System.out.print(contraseña.charAt(i));
					}
					
					//si no se imprime *
					else {
						System.out.print("*");
					}

				}

			}


		} while (!iguales);
		
		

		System.out.println("\nACERTASTE!");
	}

	
}
