package Desarrollo_Taller2;
import java.util.*;                     //--> para que funcione el Date
public class Pedido {
    
    //Atributos
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private String numeroTarjetaCredito;

    //Constructor
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, String numeroTarjetaCredito){
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
    
    //Métodos
    public Cliente getCliente(){
        return cliente;
    }
    public Producto[] getProducto(){
        return producto;
    }
    public Date getFecha(){
        return fecha;
    }
    public String getnumeroTarjetaCredito(){
        return numeroTarjetaCredito;
    }

    public String toString(){
        return "[DATOS_CLIENTE] " + cliente + Arrays.toString(producto) + "\nFECHA_COMPRA: " + fecha + "\nNUM_TARJETA_CREDITO: " + numeroTarjetaCredito;
    }
}
