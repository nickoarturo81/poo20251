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
                    System.out.print("Registrar CILINDRAJE: ");
                    String placa = leer.nextLine();

                    int posicion
                    if (cilindraje <= 400){
                        System.out.println("Elija la posición (0-20): ")
                        posicion = Leer.nextInt();
                    if (posicion >= 0 && posicion < 20 && a[posicion].equals(" ")){
                        a[posicion] = placa;
                        System.out.println("Placa registrada en posicion " + posicion + " del arreglo a.");
                    }else {
                        System.out.println("Ocupado");
                    }
                    }
            }
                    leer.nextLine();
                    System.out.println();
                    System.out.print("Registrar PLACA: "); 
                    String cilindraje = leer.nextLine();
                    break;

                case 2:
                    System.out.print("*** REGISTRAR SALIDA ***");
                    System.out.println();
                    System.out.print("Buscar PLACA: ");
                    String placa1 = leer.nextLine();
                    leer.nextLine();
                    System.out.println();
                    System.out.print("Registrar TIEMPO: ");
                    String tiempo = leer.nextLine();
                    if (tiempo>30){
                         System.out.print( "Valor a pagar: $0 ");
                    } else 
                     System.out.print( " Valor a pagar es:" + tiempo + );
                    } else 
                    break;
            

        } while (opc != 4);
    }    
}
        
    
