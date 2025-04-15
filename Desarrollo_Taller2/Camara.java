package Desarrollo_Taller2;

public class Camara extends Producto { //extends = hereda 
    
    //Atributos
    private String marca;
    private String modelo;
    private long precio;

    //Constructor
    public Camara(String marca, String modelo, int numero, long precio) {
        super(numero); // --> Atributo heredado de la clase padre Producto
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodos
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }

    public long getPrecio(){
        return precio;
    }

    public String toString(){
        return "[CAMARA]\nID: " + super.getNumero() + " MARCA:  " + marca + "  MODELO:  " + modelo + " PRECIO: $" + precio;
    }
}
