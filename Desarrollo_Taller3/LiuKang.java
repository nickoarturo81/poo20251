package Desarrollo_Taller3;

public class LiuKang extends Personaje{
    
    //Constructor
    public LiuKang(String nombre){
        super(nombre); // <-- Llama al construtor nombre heredado de la clase Personaje y le asigna un nombre
        this.nomAtaque = new String[] { "Bola de Fuego", "Patada Voladora", "Aliento Dragón" };
        this.danoAtaque = new int[] { 10, 20, 30 };
    }
}
