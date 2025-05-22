package Desarrollo_Taller3;
import java.util.Random;
import java.util.Random;

public class Scorpion extends Personaje {

    // Constructor
    public Scorpion(String nombre) {
        super(nombre);// <-- Llama al construtor nombre heredado de la clase Personaje y le asigna un nombre
        this.nomAtaque = new String[] { "Arpón", "Llama Infernal", "Día del Juicio" };
        this.danoAtaque = new int[] { 10, 23, 28 };
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int indice = rand.nextInt(nomAtaque.length);

        int dano = danoAtaque[indice];
        String ataqueElegido = nomAtaque[indice];

        // Mensaje especial si usa "Arpón"
        if (ataqueElegido.equals("Arpón")) {
            System.out.println(this.nombre + ": GetOverHere!");
        }

        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre()
                + " con " + ataqueElegido + " causando " + dano + " puntos de daño.");
    }
}
