package Desarrollo_Taller3;

public class SubZero extends Personaje{
   
    // Constructor
    public SubZero(String nombre){
        super(nombre); // <-- Llama al construtor nombre heredado de la clase Personaje y le asigna un nombre
        this.nomAtaque = new String[] { "Congelar", "Clon de Hielo", "Martillo de Escarcha" };
        this.danoAtaque = new int[] { 8, 25, 25 };
    }

}
