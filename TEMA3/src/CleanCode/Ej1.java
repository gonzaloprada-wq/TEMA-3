package CleanCode;

import java.util.*;

public class Ej1 {
	public static void main(String[] args) {
		// Inicializar scanner para leer la entrada
		Scanner scanner = new Scanner(System.in);

		// Constantes del sistema (valores fijos)
		final double IVA = 0.21;
		final double DESCUENTO_MAYOR_100 = 0.10;
		final double DESCUENTO_SOCIO = 0.05;
		final double LIMITE_DESCUENTO = 100.0;

		// Configuración del stock
		final int TAMANO_STOCK = 200;
		final int STOCK_INICIAL = 10;

		// Inicializar el stock
		int[] stock = new int[TAMANO_STOCK];
		for (int indice = 0; indice < stock.length; indice++) {
			stock[indice] = STOCK_INICIAL;
		}

		// Variable para controlar el bucle principal
		boolean continuar = true;

		// Bucle principal que se ejecuta mientras el usuario quiera comprar
		while (continuar) {
			// Solicitar cantidad de productos a procesar
			System.out.println("¿Cuántos productos diferentes va a comprar?");
			int cantidadProductos = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			// Arrays para almacenar los datos de los productos
			String[] nombresProductos = new String[cantidadProductos];
			double[] preciosProductos = new double[cantidadProductos];
			int[] unidadesProductos = new int[cantidadProductos];

			// Variable para acumular el subtotal de la compra
			double subtotal = 0.0;

			// Bucle para recoger información de cada producto
			for (int indice = 0; indice < cantidadProductos; indice++) {
				// Pedir el nombre del producto
				System.out.println("Nombre del producto " + (indice + 1) + ":");
				nombresProductos[indice] = scanner.nextLine();

				// Pedir el precio del producto
				System.out.println("Precio del producto:");
				preciosProductos[indice] = scanner.nextDouble();

				// Pedir la cantidad que desea el usuario
				System.out.println("Cantidad:");
				unidadesProductos[indice] = scanner.nextInt();
				scanner.nextLine(); // Limpiar el buffer

				// Acumular el subtotal (precio * cantidad)
				subtotal += preciosProductos[indice] * unidadesProductos[indice];

				// Calcular el indice del stock usando una formula
				int indiceStock = (nombresProductos[indice].length() * 17 + indice * 3) % TAMANO_STOCK;
				// Actualizar el stock restando las unidades vendidas
				stock[indiceStock] -= unidadesProductos[indice];
				// Mostrar advertencia si el stock queda negativo
				if (stock[indiceStock] < 0) {
					System.out.println("Aviso: stock negativo.");
				}
			}

			// Preguntar si el cliente es socio para aplicar descuento
			System.out.println("¿Es socio? (S/N)");
			String respuestaSocio = scanner.nextLine();
			boolean esSocio = respuestaSocio.equalsIgnoreCase("S");

			// Calcular descuento por compra mayor a 100 euros
			double descuentoMayor100 = 0.0;
			if (subtotal > LIMITE_DESCUENTO) {
				descuentoMayor100 = subtotal * DESCUENTO_MAYOR_100;
			}

			// Calcular el subtotal despues del primer descuento
			double subtotalConDescuento = subtotal - descuentoMayor100;

			// Calcular descuento adicional para socios
			double descuentoSocio = 0.0;
			if (esSocio) {
				descuentoSocio = subtotalConDescuento * DESCUENTO_SOCIO;
			}

			// Calcular la base imponible (antes de IVA)
			double baseImponible = subtotalConDescuento - descuentoSocio;
			// Calcular el IVA sobre la base imponible
			double ivaCalculado = baseImponible * IVA;
			// Calcular el total final a pagar
			double total = baseImponible + ivaCalculado;

			// Llamar a la funcion que muestra el ticket
			imprimirTicket(nombresProductos, preciosProductos, unidadesProductos, subtotal, descuentoMayor100,
					descuentoSocio, baseImponible, ivaCalculado, total);

			// Preguntar al usuario si desea realizar otra compra
			System.out.println("¿Otra compra? (S/N)");
			String respuestaContinuar = scanner.nextLine();
			continuar = respuestaContinuar.equalsIgnoreCase("S");
		}

		// Mensaje final del programa
		System.out.println("Fin del programa.");
		scanner.close();
	}

	// Funcion para imprimir el ticket de compra
	private static void imprimirTicket(String[] nombresProductos, double[] preciosProductos, int[] unidadesProductos,
			double subtotal, double descuentoMayor100, double descuentoSocio, double baseImponible, double ivaCalculado,
			double total) {
		System.out.println("\n=========== TICKET ===========");

		// Mostrar cada producto con su informacion
		for (int indice = 0; indice < nombresProductos.length; indice++) {
			double totalProducto = preciosProductos[indice] * unidadesProductos[indice];
			System.out.println(nombresProductos[indice] + " - " + unidadesProductos[indice] + " x "
					+ preciosProductos[indice] + " = " + totalProducto);
		}

		// Mostrar el desglose de precios
		System.out.println("------------------------------");
		System.out.println("SUBTOTAL: " + subtotal);
		System.out.println("DESCUENTO >100: " + descuentoMayor100);
		System.out.println("DESCUENTO SOCIO: " + descuentoSocio);
		System.out.println("BASE: " + baseImponible);
		System.out.println("IVA: " + ivaCalculado);
		System.out.println("TOTAL: " + total);
		System.out.println("==============================\n");
	}
}
