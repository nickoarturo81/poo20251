package parkingnow;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        // Arreglos (reservamos los espacios)
        String[] a = new String[20]; // -> PLACA: Para menores a 400 cc
        String[] b = new String[10]; // -> PLACA: para mayores a 400 cc

        // Menú Principal

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
                //Dar entrada a la motocicleta
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
                    // Acomodar motocicleta de cilindraje <400
                    if (cilindraje <= 400) {
                        mostrarPosiciones(a,"menor de 400cc");
                        boolean posicionCorrecta = false;
                        while (!posicionCorrecta) {
                            System.out.println();
                            System.out.println("Elija la posición (P) de 0-19: ");
                            posicion = leer.nextInt();
                            
                            if (posicion >= 0 && posicion <=20 && a[posicion] == null) {
                                a[posicion] = placa;
                                System.out.println("Motocicleta con placa " + placa + " registrada en posicion " + posicion);
                                posicionCorrecta = true;
                            } else if (posicion >= 20) {
                                System.out.println("No existe posición, debe ser de 0 a 19");
                            } else {
                                System.out.println("No disponible");
                            }  
                        } 
                    }
                    // Acomodar motocicleta de cilindraje >400
                    if (cilindraje > 400) {
                        mostrarPosiciones(b,"mayor de 400cc");
                        boolean posicionCorrecta = false;
                        while (!posicionCorrecta) {
                            System.out.println();
                            System.out.println("Elija la posición(P) de 0-9: ");
                            posicion = leer.nextInt();
                            if (posicion >= 0 && posicion <=9 && b[posicion] == null) {
                            b[posicion] = placa;
                            System.out.println("Motocicleta con placa " + placa + " registrada en posicion " + posicion);
                            posicionCorrecta = true;
                            } else if (posicion >= 10) {
                            System.out.println("No existe posición, debe ser de 0 a 9");
                            } else {
                            System.out.println("No disponible");
                            }
                        } 
                    }
                    leer.nextLine();
                    System.out.println();
                break;
                //Dar salida a la motocicleta
                case 2:
                    System.out.print("*** REGISTRAR SALIDA ***");
                    System.out.println();
                    System.out.print("Buscar PLACA: ");
                    leer.nextLine();
                    String placa1 = leer.nextLine();
                    boolean encontrado = false;
                    int posicionPlaca = -1;
                    String cilindrajeMoto = "";
                    // buscar placa menores a 400cc
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] != null && a[i].equals(placa1)) {
                            encontrado = true;
                            posicionPlaca = i;
                            cilindrajeMoto = "menor de 400cc";
                        }
                    }
                    // buscar placa mayores a 400cc
                    if (!encontrado) {
                        for (int i = 0; i < b.length; i++) {
                            if (b[i] != null && b[i].equals(placa1)) {
                                encontrado = true;
                                posicionPlaca = i;
                                cilindrajeMoto = "mayor de 400cc";
                            }
                        }
                    }
                    // Al ubicar la placa, solicitar el tiempo
                    if (encontrado) {
                        System.out.print("Registrar TIEMPO: ");
                        int tiempo = leer.nextInt();
                        if (tiempo <= 30) {
                            System.out.println();
                            System.out.print("La moto con placa: " + placa1 + " ubicado en la posición: " + posicionPlaca + " tiene un valor a pagar: $0 ");
                        } else if (tiempo > 30 && tiempo <= 60) {
                            System.out.println();
                            System.out.print("La moto con placa: " + placa1 + " ubicado en la posición: " + posicionPlaca + " tiene un valor a pagar: $800 ");
                        } else if (tiempo > 60) {
                            System.out.println();
                            System.out.println("La moto con placa: " + placa1 + " ubicado en la posición: " + posicionPlaca + " tiene un valor a pagar: $2000 ");
                        }

                        // Liberar posición al dar salida moto
                        if (cilindrajeMoto.equals("menor de 400cc")) {
                            a[posicionPlaca] = null;
                        } else if (cilindrajeMoto.equals("mayor de 400cc")) {
                            b[posicionPlaca] = null;
                        }
                        System.out.println("La posición " + posicionPlaca + " ha sido liberado");

                    } else {
                        System.out.println("La placa " + placa1 + " no ha sido registrada");
                    }
                break;
                //Salir del sistema
                case 3:
                    System.out.println("Saliendo del sistema");
                break;
                //En caso de registrar una opción distinta a 1, 2 y 3
                default:
                    System.out.println("ERROR: Debe seleccionar una de las 3 opciones");
                break;
            }
        } while (opc != 3);
    }
    //Mostrar posiciones disponibles (Se usa un metodo)
    public static void mostrarPosiciones(String[] arreglo, String tipo) {
        System.out.println("*** Posiciones disponibles: " + tipo + " ***");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                System.out.print("P" + i + ":" + "[ ] ");
            }else{
                System.out.print("P" + i + ":" + "["+arreglo[i]+"] ");
            }
        }
    }
}