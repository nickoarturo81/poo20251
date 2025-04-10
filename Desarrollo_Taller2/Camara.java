package Desarrollo_Taller2;

public class Camara extends Producto { //extends = hereda 
    
    //Atributos
    private String marca;
    private String modelo;

    //Constructor
    public Camara(String marca, String modelo, int numero) {
        super(numero); // --> Atributo de la clase padre Producto
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metodos
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }

    public String toString(){
        return "[CAMARA]\nID: " + super.getNumero() + " MARCA:  " + marca + "  MODELO:  " + modelo;
    }
}
