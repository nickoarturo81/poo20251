package Desarrollo_Taller;

public class Ejericicio11 {
    public static void main(String[] args) {
        /*
         * Dado un arreglo A de N elementos se desea generar tres arreglos que contengan
         * los elementos negativos, cero y positivos de arreglo inicial.
         */

        // Creación del arreglo A
        int[] a = { 2, 17, -2, 26, 0, 5, -25, 23, -12, 33, -14, 32, -40  };

        // Iniciar el conteo
        int contadorPos = 0;                // --> Suma la cantidad de números positivos
        int contadorNeg = 0;                // --> Suma la cantidad de números negativos
        int contadorCero = 0;               // --> Suma la cantidad de ceros

        // Identificar Positivos, Negativos, Cero
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {                 //--> Si el numero es mayor que cero entonces es positivo
                contadorPos++;              //--> Si es verdadero suma un 1 al contadorPos
            } else if (a[i] < 0) {          //--> Si el numero es menor que cero entonces es negativo
                contadorNeg++;              //--> Si es verdadero suma un 1 al contadorNeg
            } else if (a[i] == 0) {         //--> Si el numero es igual a cero
                contadorCero++;             //--> Si es verdadero suma un 1 al contadorCero
            }
        }

        // Creación de los arreglos que almacenarán los números positivos, negativos y cero
        int[] pos = new int[contadorPos];                           
        int[] neg = new int[contadorNeg];
        int[] cero = new int[contadorCero];

        // Rellenar los nuevos arreglos con los valores positivos, negativos y cero
        int resulPos = 0;
        int resulNeg = 0;
        int resulCero = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {                 //--> Si el número es positivo 
                pos[resulPos] = a[i];       // --> guarda el valor en la posición en el arreglo
                resulPos++;                 
            } else if (a[i] < 0) {
                neg[resulNeg] = a[i];
                resulNeg++;
            } else if (a[i] == 0) {
                cero[resulCero] = a[i];
                resulCero++;
            }
        }

        // Mostrar Positivos, Negativos y Cero
        System.out.print("Los números positivos son: ");
        for (int i = 0; i < pos.length; i++) {
            System.out.print(pos[i] + ", ");
        }
        System.out.println(); //--> Salto de Página

        System.out.print("Los números negativos son: ");
        for (int i = 0; i < neg.length; i++) {
            System.out.print(neg[i] + ", ");
        }
        System.out.println();

        System.out.print("Los números iguales a cero son: ");
        for (int i = 0; i < cero.length; i++) {
            System.out.print(cero[i] + ", ");
        }
        System.out.println();
    }
}
