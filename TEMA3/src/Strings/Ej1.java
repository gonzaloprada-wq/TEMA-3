package Strings;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		// Creo el escaner para guardar los valores
		Scanner reader = new Scanner(System.in);

		// pido mediante un mensaje que se ingrese la cadena 1 que luego compararemos
		System.out.print("Ingresa cadena 1: ");
		String cadena1 = reader.nextLine();

		// creo un int con la longitud de la cadena1
		int cadenaLong1 = cadena1.length();

		// pido mediante un mensaje que se ingrese la cadena 2 que luego compararemos
		System.out.print("Ingresa cadena 2: ");
		String cadena2 = reader.nextLine();
		// creo un int con la longitud de la cadena2
		int cadenaLong2 = cadena2.length();

		// Si cadena 1 es mas larga se imprime un mensaje confirmando que lo es
		if (cadenaLong1 > cadenaLong2) {
			System.out.println("La cadena 1 es mas larga.");
		}

		// si es mas pequeña, se indica que cadena 2 es mas larga
		else if (cadenaLong1 < cadenaLong2) {
			System.out.println("La cadena 2 es mas larga.");
		}

		// si no es ninguna de los dos significa que son iguales
		else {
			System.err.println("Las dos cadenas son igual de largas.");
		}
	}

}
