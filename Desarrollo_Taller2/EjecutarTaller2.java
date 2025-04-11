package Desarrollo_Taller2;
import java.util.*; 

public class EjecutarTaller2 {

    public static void main(String[] args) {
        
        //Creación de los objetos:

        //Foto
        Foto[] f1 = new Foto[3];
        f1[0] = new Foto("Foto1.jpg");
        f1[1] = new Foto("Foto2.jpg");
        f1[2] = new Foto("Foto3.png");
    
        //ObjetosClientes:
        Cliente objCliente1 = new Cliente(" 1107093536 ", " Andres Caicedo ");
        Cliente objCliente2 = new Cliente(" 1425793258 ", " Carlos Gaviria ");
        Cliente objCliente3 = new Cliente(" 1154639878 ", " Alejandro Garcia ");

        //Producto
        Producto[] p = new Producto[2];
        p[0] = new Impresion(null, f1, 0);
        p[1] = new Camara(null, null, 0);

        //ObjetosImpresion
        Impresion objImpresion1 = new Impresion(" BLANCO/NEGRO ", f1, 1);
        Impresion objImpresion2 = new Impresion(" RGB ", f1, 2);


        //ObjetosPedidos:
        Date fechaActual = new Date();
        Pedido objPedido1 = new Pedido(objCliente1, p, fechaActual, 623417546);
        Pedido objPedido2 = new Pedido(objCliente2, p, fechaActual, 754215639);
        Pedido objPedido3 = new Pedido(objCliente3, p, fechaActual, 754215639);

        //ObjetosCamara
        Camara objCamara1 = new Camara("Sony", "Alpha APS", 1);
        Camara objCamara2 = new Camara("Nikon", "COOLPIX", 2);
        Camara objCamara3 = new Camara("Canon", "EOS R6", 3);

               
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
                    System.out.print("SERVICIO DE IMPRESION");
                    System.out.println();
                    System.out.println("Selecciona la opción");
                    System.out.println("1. Impresión de Foto Cliente1 ");
                    System.out.println("2. Impresión de Foto Cliente2 ");
                    System.out.println("3. Impresión de Foto Cliente3 ");
                    System.out.println("4. Salir ");
                    leer.nextLine();
                    int opcImpresion = leer.nextInt();
                    switch (opcImpresion) {
                        case 1:
                            System.out.println();
                            System.out.println("PEDIDO");
                            System.out.println(objImpresion1);
                            System.out.println(objPedido1);
                            System.out.println();
                        break;
                        case 2:
                            System.out.println();
                            System.out.println("PEDIDO");
                            System.out.println(objImpresion2);
                            System.out.println(objPedido2);
                            System.out.println();
                        break;
                        case 3:
                            System.out.println();
                            System.out.println("PEDIDO");
                            
                            System.out.println(objPedido3);
                            System.out.println();
                        break;
                        case 4:
                        System.out.println("Saliendo del sistema");
                        break;
                    }
                break;
                case 2:
                    System.out.print("SERVICIO DE CAMARA");
                    System.out.println();
                    System.out.println("Selecciona la opción");
                    System.out.println("1. Datos Cámara de Cliente1 ");
                    System.out.println("2. Datos Cámara de Cliente2 ");
                    System.out.println("3. Datos Cámara de Cliente3 ");
                    System.out.println("4. Salir ");
                    leer.nextLine();
                    int opcCamara = leer.nextInt();
                    switch (opcCamara) {
                        case 1:
                            System.out.println();
                            System.out.println("PEDIDO");
                            System.out.println(objCamara1);
                            System.out.println(objPedido1);
                            System.out.println();
                        break;
                        case 2:
                            System.out.println();
                            System.out.println("PEDIDO");
                            System.out.println(objCamara2);
                            System.out.println(objPedido2);
                            System.out.println();
                        break;
                        case 3:
                            System.out.println();
                            System.out.println("PEDIDO");
                            System.out.println(objCamara3);
                            System.out.println(objPedido3);
                            System.out.println();
                        break;
                        case 4:
                        System.out.println("Saliendo del sistema");
                        break;
                    }    
                break;
                case 4:
                System.out.println("Saliendo del sistema");
                break;
            }
        } while (opc != 3);
    }
    
}
