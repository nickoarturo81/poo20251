package Desarrollo_Taller;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Se tienen dos arreglos unidimensionales, que guarden las edades de un grupo de personas
         * se pide hallar el valor mayor.
         */

         //Creación del arreglo unidimensional
         int[] a = {10, 50, 47, 26, 18, 32, 15};
         
         /*
          * Creación de variable edadMayor que empiece a contar desde la posición 0, por lo que empezará
          * a contar a partir en este caso el número 10.
          */
         int edadMayor = a[0];

         //Identificar Valor Mayor
         for (int i = 0; i < a.length; i++) {
            if (a[i] > edadMayor) {
                    edadMayor = a[i];
            }
         }

         //Mostra el valor mayor
         System.out.println("El valor mayor es: " + edadMayor);
    }
}
