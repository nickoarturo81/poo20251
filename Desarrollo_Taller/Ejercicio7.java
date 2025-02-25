package Desarrollo_Taller;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         * A partir del arreglo A de 10 elementos, generar dos arreglos que separe los
         * pares e impares
         */

        // Creación del arreglo A
        int[] a = { 2, 17, 5, 26, 45, 5, 15, 23, 10, 33 };

        // Iniciar el conteo
        int contadorPares = 0; //--> Suma la cantidad de número pares
        int contadorImpares = 0; //--> Suma la cantidad de número pares

        // Identificar Pares e Impares
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) { // --> Valida si el número es par o impar
                contadorPares++; //--> Si es par se suma 1
            } else {
                contadorImpares++; // --> Si es impar se suma 1
            }
        }

        // Creación de los arreglos que almacenarán los números pares e impares
        int[] pares = new int[contadorPares]; //--> Creara un arreglo con la cantidad de números pares que sumo en la linea anterior y los almacenará. 
        int[] impares = new int[contadorImpares]; //--> Creara un arreglo con la cantidad de números impares que sumo en la linea anterior y los almacenará.

        // Rellenar los nuevos arreglos con los valores pares e impares
        int resulPares = 0;
        int resulImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) { 
                pares[resulPares] = a[i];
                resulPares++;
            } else {
                impares[resulImpares] = a[i];
                resulImpares++;
            }
        }

        // Mostrar Pares e Impares
        System.out.print("Los números pares son: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + ", ");
        }
        System.out.println(); //--> Salto de Página

        System.out.print("Los números impares son: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + ", ");
        }
        System.out.println();
    }
}
