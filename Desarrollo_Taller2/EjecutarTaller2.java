package Desarrollo_Taller2;
import java.util.*; 

public class EjecutarTaller2 {

    public static void main(String[] args) {
        
        //Creaciónde los objetos:
        
        Foto[] f = new Foto[1];
        f[0] = new Foto("Foto1");
     
        Cliente objCliente1 = new Cliente(" 1107093536 ", " Andres Caicedo ");
        
        Producto[] p = new Producto[1];
        p[0] = new Producto(1);

        Impresion objImpresion1 = new Impresion(" B/N ", f, 0);
        Date fechaActual = new Date();
        Pedido objPedido1 = new Pedido(objCliente1, p, fechaActual, 623417546);

        Camara objCamara1 = new Camara("sony", "Alpha APS", 1);


        System.out.println(objPedido1);
        System.out.println(objImpresion1);
        System.out.println(objCamara1);

    }
    
}
