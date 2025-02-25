package Desarrollo_Taller;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Se tienen dos arreglos unidimensionales, que guarden las edades de un grupo de personas
         * se pide hallar el valor mayor.
         */

         //Creación del 1er arreglo unidimensional
         int[] a = {10, 50, 31, 26, 18, 32, 15};

         //Creación del 2do arreglo unidimensional
         int[] b = {20, 31, 17, 42, 53, 60, 61};
         
         /*Variable para iniciar con el arreglo a[10], la variable toma el valor 10
          */
         int edadMayor = a[0];

         //Identificar Valor Mayor 1er Arreglo
         for (int i = 0; i < a.length; i++) {
            if (a[i] > edadMayor) { //--> Compara si el arreglo a con X posición es Mayor a la valor de la variable
                    edadMayor = a[i]; //--> la variable toma el valor si este es mayor.
            }
         }

         //Identificar Valor Mayor 2do Arreglo
         for (int i = 0; i < b.length; i++) {
            if (b[i] > edadMayor) {
                    edadMayor = b[i];
            }
         }

         //Mostra el valor mayor
         System.out.println("El valor mayor es: " + edadMayor);
    }
}
