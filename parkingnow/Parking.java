package parkingnow;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {
        
        //Arreglos (reservamos los espacios)
        String[] a = new String[20]; // -> PLACA: Para menores a 400 cc
        String[] b = new String[10]; // -> PLACA: para mayores a 400 cc

        //Menú
        
        Scanner leer = new Scanner(System.in);
        int opc;
        do {
            System.out.print("*** MENU PRINCIPAL ***");
            System.out.println();
            System.out.print("1. Registrar Entrada");
            System.out.println();
            System.out.print("2. Registrar Salida");
            System.out.println();
            System.out.print("3. Salir");
            System.out.println();
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("*** REGISTRAR ENTRADA ***");
                    System.out.println();
                    System.out.print("Registrar PLACA: ");
                    String placa = leer.next();
                    leer.nextLine();
                    System.out.print("Registrar CILINDRAJE: ");
                    int cilindraje = leer.nextInt();
                    leer.nextLine();

                    int posicion;
                    
                    if (cilindraje <= 400){
                        System.out.println("Elija la posición (0-19): ");
                        posicion = leer.nextInt();
                    if (posicion >= 0 && posicion < 20 && a[posicion] == null){
                        a[posicion] = placa;
                        System.out.println("Motocicleta con placa " + placa + " registrada en posicion " + posicion);
                    }else {
                        System.out.println("Ocupado");
                    }
                }
                leer.nextLine();
                System.out.println();
                break;

                case 2:
                    System.out.print("*** REGISTRAR SALIDA ***");
                    System.out.println();
                    System.out.print("Buscar PLACA: ");
                    String placa1 = leer.nextLine();
                    leer.nextLine();
                    System.out.println();
                    System.out.print("Registrar TIEMPO: ");
                    int tiempo = leer.nextInt();
                    
                    if (tiempo<=30){
                         System.out.print( "Valor a pagar: $0 ");
                    } else if (tiempo >30 && tiempo <=60){
                        System.out.print( " Valor a pagar es: $800");
                    } else {
                        System.out.println("Valor a pagar es: $2000");
                    }
                break;    
            } 
                    
            

        } while (opc != 3);
    }
}
