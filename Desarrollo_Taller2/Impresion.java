package Desarrollo_Taller2;

import java.util.Arrays;

public class Impresion extends Producto { // --> extends = hereda 

    //Atributo
    private String color;
    private Foto[] foto; // --> Arreglo de 
    private long precio;

    //Construtor
    public Impresion(String color, Foto[] foto, int numero, long precio){
        super(numero, precio); // Llama al constructor de la clase Producto con número y precio
        this.color = color;
        this.foto = foto;
        this.precio = precio; // Ahora sí asigna el precio correctamente
    }

    //Metodos
    public String getColor(){
        return color;
    }
    public Foto[] getFoto(){
        return foto;
    }

    public long getPrecio() {
        return precio;
    }

    public String toString(){
        return "[IMPRESION]\nID:" + super.getNumero() + " COLOR:" + color + " " + " PRECIO " + precio + Arrays.toString(foto);
    }
}
