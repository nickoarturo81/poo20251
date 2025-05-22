package Desarrollo_Taller3;

public class Scorpion extends Personaje {

    // Constructor
    public Scorpion(String nombre) {
        super(nombre);// <-- Llama al construtor nombre heredado de la clase Personaje y le asigna un nombre
        this.nomAtaque = new String[] { "Arpón", "Llama Infernal", "Día del Juicio" };
        this.danoAtaque = new int[] { 10, 23, 28 };
    }

}
