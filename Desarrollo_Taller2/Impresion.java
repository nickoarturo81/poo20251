package Desarrollo_Taller2;

public class Impresion extends Producto { // --> extends = hereda 

    //Atributo
    private String color;
    private Foto[] foto; // --> Arreglo de fotos

    //Construtor
    public Impresion(String color,Foto[] foto, int numero){
        super(numero); // --> Atributo de la clase padre Producto
        this.color = color;
        this.foto = foto;
    }

    //Metodos
    public String getColor(){
        return color;
    }
    public Foto[] getFoto(){
        return foto;
    }
}
