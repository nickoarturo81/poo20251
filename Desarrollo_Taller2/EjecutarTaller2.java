package Desarrollo_Taller2;
import java.util.*; 

public class EjecutarTaller2 {

    public static void main(String[] args) {
        
        //Creación de los objetos:

        //ObjetosFoto
        Foto[] f = new Foto[3];
        f[0] = new Foto(".jpg");
        f[1] = new Foto(".png");
        f[2] = new Foto(".gif");
    
        //ObjetosProducto
        Producto[] p = new Producto[2];
        p[0] = new Impresion(null, f, 0);
        p[1] = new Camara(null, null, 0, 0);
    
                             
        Scanner leer = new Scanner(System.in);
        int opc;
        do {

            System.out.print("*** MENU PRINCIPAL ***");
            System.out.println();
            System.out.print("1. Servicio de Impresión");
            System.out.println();
            System.out.print("2. Servicio Compra de Cámaras");
            System.out.println();
            System.out.print("3. Salir");
            System.out.println();
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Servicio de Impresión");
                    System.out.println();
                    Cliente objCliente1 = Cliente.digCliente();
                    System.out.println();
                    System.out.println("Cliente registrado exitosamente");
                    System.out.println();
                    System.out.println("Seleccione el formato que desea imprimir la foto");

                    //Mostrar las tres opciones a elegir
                    for (int i = 0; i < f.length; i++) {
                        System.out.println((i + 1) + ". " + f[i].getFichero());
                    }
                    System.out.print("Opción: ");

                    //Guardar la opción elegedia
                    int formatoSeleccionado = leer.nextInt();
                    leer.nextLine();

                    // Validar que las opciones esten en el rango
                    if (formatoSeleccionado >= 1 && formatoSeleccionado <= 3) {
                    Foto foto = f[formatoSeleccionado - 1]; // <-- Se pone -1 ya que los arreglos empiezan en 0 y el cliente coloca 1 en adelante.
                    System.out.println("\nFormato seleccionado: " + foto.getFichero()); //Mostrar el formato elegido
                    Foto[] fotoImprimir = { foto }; //Almacena el tipo de foto que se ha seleccionado
                    Impresion producto = new Impresion("A color", fotoImprimir, formatoSeleccionado);

                    // Solicitar número de tarjeta
                    System.out.print("Ingrese el número de tarjeta de crédito: ");
                    String tarjeta = leer.nextLine();
                    leer.nextLine();

                    // Crear el pedido
                    Producto[] productos = {producto};
                    Date fecha = new Date();
                    Pedido pedido = new Pedido(objCliente1, productos, fecha, tarjeta);

                    // Mostrar el pedido creado
                    System.out.println("\nPedido creado exitosamente:");
                    System.out.println(pedido.toString());
                    System.out.println();

                    //Si no estan en el rango sale error.
                    } else {
                    System.out.println("Opción inválida.");
                    }
                break;
                case 2:
                    System.out.println("Servicio de Compra Cámaras");
                    System.out.println();
                    Cliente objCliente2 = Cliente.digCliente();
                    System.out.println();
                    System.out.println("Cliente registrado exitosamente");
                    System.out.println();
                    System.out.println("Seleccione la cámara que desea comprar:");
                    System.out.println("1. Sony Alpha APS - $380.000");
                    System.out.println("2. Nikon COOLPIX - $390.500");
                    System.out.println("3. Canon EOS R6 - $880.500");

                    System.out.print("\nOpción: ");
                    int opcCamara = leer.nextInt();
                    leer.nextLine(); // Limpiar buffer

                    Camara camara = null;
                    switch (opcCamara) {
                        case 1:
                            camara = new Camara("Sony", "Alpha APS", 1, 380000);
                        break;
                        case 2:
                            camara = new Camara("Nikon", "COOLPIX", 2, 390500);
                        break;
                        case 3:
                            camara = new Camara("Canon", "EOS R6", 3, 880500);
                        break;
                        default:
                        System.out.println("Debe seleccionar una de las tres opciones");
                        break;
                    }

                if (camara != null) {
                    System.out.print("¿Cuántas unidades desea comprar? ");
                    int cantidad = leer.nextInt();
                    leer.nextLine();

                    long totalPagar = camara.getPrecio() * cantidad;

                    System.out.print("Ingrese el número de tarjeta de crédito: ");
                    String tarjeta = leer.nextLine();

                    Producto[] productos = new Producto[1];
                    productos[0] = camara;

                    Date fecha = new Date();
                    Pedido pedido = new Pedido(objCliente2, productos, fecha, tarjeta);

                    System.out.println("\nPedido creado exitosamente:");
                    System.out.println(pedido.toString());
                    System.out.println("CANTIDAD: " + cantidad);
                    System.out.println("TOTAL A PAGAR: $" + totalPagar);
                    System.out.println();
                }   

                break;
                default:
                System.out.println("Debe seleccionar una de las tres opciones.");
                break;
            }
            
        } while (opc != 3);
    }
    
}
