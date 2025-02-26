package Desarrollo_Taller;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
         * Generar un arreglo con 30 números, contar e imoprimir mayores y menores y en caso de que 
         * se repitan indicar cuantas veces.
         */

        //Dar tamaño al arreglo
        int[] a = new int[30];

        //De acuerdo al tamaño, generar numeros aleatorios
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (30 - 1)) + 1;
        }

        //Imprimir los números del arreglo
        System.out.println("Los números generados son: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " | ");
        }
        System.out.println();

        //Varible para almacenar el número mayor
        int numMayor = a[0];
        //Variable para almacenar el número menor
        int numMenor = a[0];

        //Identificar Valor Mayor
        for (int i = 0; i < a.length; i++) {
            if (a[i] > numMayor) { 
                numMayor = a[i]; 
            }
            
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < numMenor) { 
                numMenor = a[i]; 
            }
        }

        //Crear variables para encontrar los numeros repetidos
        int numRepet1 = 0;
        int numRepet2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == numMayor) {
                numRepet1++;
            } else {
                if (a[i] == numMenor) {
                    numRepet2++;
                }
            }
        }
    

        // Mostrar numero mayor, menor y cantidad de que se repiten
        System.out.print("El número mayor es: " + numMayor + " y se repite: " + numRepet1 + " veces");
        System.out.println();
        System.out.print("El número menor es: " + numMenor + " y se repite: " + numRepet2 + " veces");
        System.out.println();
    }
}
