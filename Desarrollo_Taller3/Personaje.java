package Desarrollo_Taller3;

import java.util.Random;

public class Personaje {

    // Atributos:
    protected String nombre;
    protected int puntosDeVida;
    protected String[] nomAtaque;
    protected int[] danoAtaque;

    // Constructor
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.nomAtaque = new String[0];
        this.danoAtaque = new int[0];
    }

    // Métodos

    //getNombre
    public String getNombre() {
        return this.nombre;
    } // <-- Retorna el nombre del personaje

    //estaVivo()
    public boolean estaVivo() {
        return this.puntosDeVida > 0;       //<-- Si los puntos de vida son mayores a 0 está vivo
    }

    //recibirDano()
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;          //<-- Resta los puntos de vida al recibir daño
        if (this.puntosDeVida < 0) {        //<-- Si los puntos de vida es menor a 0
            this.puntosDeVida = 0;          //<-- Entonces iguala esos puntos negativos a 0
        }
    }
    
    //atacar()
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int ataqueAleatorio = rand.nextInt(nomAtaque.length);       // <-- Se crea variable ataqueAleatorio para guardar el número elegido aleatoriamente por el sistema. (Elege entre 0 a 2)
        
        int dano = danoAtaque[ataqueAleatorio];                     // <-- Se crea variable dano el cual va a almacenar los puntos de daño del ataqueAleatorio que fue elegido antes.
        String ataqueElegido = nomAtaque[ataqueAleatorio];          // <-- Se crea variable ataqueElegido el cual va a almacenar uno de los ataques del personaje.

        oponente.recibirDano(dano);                                 // <-- Ejecuta el proceso donde se le resta daño al oponente
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " con " + ataqueElegido + " causando " + dano  + " puntos de daño ");
    }

    //getPuntosDeVida()
    public int getPuntosDeVida() {
        return this.puntosDeVida;           // < -- Retorna los puntos de vida actuales
    } 
}
