package CleanCode;

import java.util.*;

public class Ej2{
    // Funcion para hacer operaciones con la matriz
    static int procesar(double[][] notas, int alumnos, int modulos, int op) {
        double suma = 0;
        double min = 10;  // Fallo: empieza en 10, deberia ser mas alto
        double max = 0;   // Fallo: empieza en 0, deberia ser mas bajo
        
        // Verificar que la matriz existe
        if (notas == null)
            return -9;
            
        // Verificar tamaños validos
        if (alumnos <= 0 || modulos <= 0)
            return -8;
            
        // Mostrar todas las notas
        if (op == 2) {
            for (int i = 0; i < alumnos; i++) {
                for (int j = 0; j < modulos; j++) {
                    System.out.print(notas[i][j] + " ");
                }
                System.out.println();
            }
            return 0;
        }
        
        // Calcular media por alumno
        if (op == 3) {
            for (int i = 0; i < alumnos; i++) {
                suma = 0;
                for (int j = 0; j < modulos; j++) {
                    suma = suma + notas[i][j];
                }
                System.out.println("Alumno " + i + " = " + (suma / modulos));
            }
            return 1;
        }
        
        // Calcular media por modulo
        if (op == 4) {
            for (int j = 0; j < modulos; j++) {
                suma = 0;
                for (int i = 0; i < alumnos; i++) {
                    suma = suma + notas[i][j];
                }
                System.out.println("Modulo " + j + " = " + (suma / alumnos));
            }
            return 2;
        }
        
        // Encontrar min y max
        if (op == 5) {
            for (int i = 0; i < alumnos; i++) {
                for (int j = 0; j < modulos; j++) {
                    // Fallo: condicion incorrecta para min
                    if (notas[i][j] < min)
                        min = notas[i][j];
                    if (notas[i][j] > max)
                        max = notas[i][j];
                }
            }
            System.out.println("Min = " + min + " Max = " + max);
            return 3;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int numAlumnos = 0;
        int numModulos = 0;
        double[][] notas = null;
        int datosCargados = 0; // 0 = no, 1 = si
        double valor;
        
        System.out.println("Gestion de Notas");

        while (opcion != 6) {
            System.out.println("\n1. Cargar datos");
            System.out.println("2. Ver notas");
            System.out.println("3. Media alumnos");
            System.out.println("4. Media modulos");
            System.out.println("5. Min/Max");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Alumnos: ");
                numAlumnos = sc.nextInt();
                System.out.print("Modulos: ");
                numModulos = sc.nextInt();
                
                // Fallo: no verificar que sean positivos
                notas = new double[numAlumnos][numModulos];
                
                for (int i = 0; i < numAlumnos; i++) {
                    for (int j = 0; j < numModulos; j++) {
                        System.out.print("Nota [" + i + "][" + j + "]: ");
                        valor = sc.nextDouble();
                        // Ajustar si esta fuera de rango
                        if (valor < 0)
                            valor = 0;
                        if (valor > 10)
                            valor = 10;
                        notas[i][j] = valor;
                    }
                }
                datosCargados = 1;
            } 
            else if (opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
                if (datosCargados == 0) {
                    System.out.println("Primero carga datos");
                } else {
                    int resultado = procesar(notas, numAlumnos, numModulos, opcion);
                    if (resultado < 0) {
                        System.out.println("Error " + resultado);
                    }
                }
            }
            else if (opcion != 6) {
                System.out.println("Opcion no valida");
            }
        }
        
        
        System.out.println("Adios");
       
    }
}