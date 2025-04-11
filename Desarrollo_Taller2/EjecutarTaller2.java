package Desarrollo_Taller2;
import java.util.*; 

public class EjecutarTaller2 {

    public static void main(String[] args) {
        
        //Creación de los objetos:

        //Foto#1
        Foto[] f1 = new Foto[1];
        f1[0] = new Foto("Foto1.jpg");
        //Foto#2
        Foto[] f2 = new Foto[1];
        f2[0] = new Foto("Foto2.jpg");
        //Foto#2
        Foto[] f3 = new Foto[1];
        f3[0] = new Foto("Foto3.png");
    
        //ObjetosClientes:
        Cliente objCliente1 = new Cliente(" 1107093536 ", " Andres Caicedo ");
        Cliente objCliente2 = new Cliente(" 1425793258 ", " Carlos Gaviria ");
        Cliente objCliente3 = new Cliente(" 1154639878 ", " Alejandro Garcia ");

        //Producto#1
        Producto[] p1 = new Producto[1];
        p1[0] = new Producto(1);
        //Producto#2
        Producto[] p2 = new Producto[1];
        p2[0] = new Producto(2);
        //Producto#3
        Producto[] p3 = new Producto[1];
        p3[0] = new Producto(3);

        //ObjetosImpresion
        Impresion objImpresion1 = new Impresion(" BLANCO/NEGRO ", f1, 1);
        Impresion objImpresion2 = new Impresion(" RGB ", f2, 2);
        Impresion objImpresion3 = new Impresion(" CMYK ", f3, 3);


        //ObjetosPedidos:
        Date fechaActual = new Date();
        Pedido objPedido1 = new Pedido(objCliente1, p1, fechaActual, 623417546);
        Pedido objPedido2 = new Pedido(objCliente2, p2, fechaActual, 754215639);
        Pedido objPedido3 = new Pedido(objCliente3, p3, fechaActual, 754215639);

        //ObjetosCamara
        Camara objCamara1 = new Camara("Sony", "Alpha APS", 1);
        Camara objCamara2 = new Camara("Nikon", "COOLPIX", 2);
        Camara objCamara3 = new Camara("Canon", "EOS R6", 3);

        //Impresion
        /*
         * System.out.println("***********************************");
        System.out.println("FACTURA #1");
        System.out.println(objPedido1);
        System.out.println(objImpresion1);
        System.out.println(objCamara1);
        System.out.println("***********************************");
        System.out.println();
        System.out.println("***********************************");
        System.out.println("FACTURA #2");
        System.out.println(objPedido2);
        System.out.println(objImpresion2);
        System.out.println(objCamara2);
        System.out.println("***********************************");
        System.out.println();
        System.out.println("***********************************");
        System.out.println("FACTURA #3");
        System.out.println(objPedido3);
        System.out.println(objImpresion3);
        System.out.println(objCamara3);
        System.out.println("***********************************");
         */
        
         Scanner leer = new Scanner(System.in);
        int opc;
        do {

            System.out.print("*** MENU PRINCIPAL ***");
            System.out.println();
            System.out.print("1. Servicio de Impresión");
            System.out.println();
            System.out.print("2. Servicio Compra de Cámara");
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
                            System.out.println(objImpresion3);
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
