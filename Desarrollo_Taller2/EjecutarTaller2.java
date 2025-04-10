package Desarrollo_Taller2;
import java.util.*; 

public class EjecutarTaller2 {

    public static void main(String[] args) {
        
        //Creaciónde los objetos:
        
        Foto[] f = new Foto[3];
        f[0] = new Foto("Foto1");
        f[1] = new Foto("Foto2");
        f[2] = new Foto("Foto3");
       


        Cliente objCliente1 = new Cliente(" 1107093536 ", " Andres Caicedo ");
        Cliente objCliente2 = new Cliente(" 1006432875 ", " Carlos Valdes ");
        Cliente objCliente3 = new Cliente(" 1054798563 ", " Brayan Galeano ");

        Producto[] p = new Producto[2];
        p[0] = new Producto(1, "Camara");

        Impresion objImpresion1 = new Impresion(" B/N ", f, 0);

        Pedido objPedido1 = new Pedido(objCliente1, p, null, 456357159);
        Pedido objPedido2 = new Pedido(objCliente1, p, null, 456357159);

        System.out.println(objPedido1);


    }
    
}
