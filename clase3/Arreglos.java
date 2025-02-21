public class Arreglos {
    public static void main(String[] args) {
        
        //Creación del Arreglo de enteros
        int [] a = {3, 6, 5, 10, 20, 1, 4, 9};

        //Recorrer y mostrar los elementos del arreglo
        //a.length --> Obtiene la longitud o tamaño del arreglo
        //a. porque la variable es la a, si fuera p seria p.length
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+ i +"] = " + a[i]);
        }
        //Para ver el arreglo de forma horizontal --> System.out.print("a["+ i +"] = " + a[i] + "\t");
    }
}