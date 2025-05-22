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
    public String getNombre() {
        return this.nombre;
    } // <-- Retorna el nombre del personaje

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    } // < -- Verifica si el personaje está vivo

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0; // <-- No se puede tener menos de 0 HP
        }
    } // < -- Recibir Daño

    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int indice = rand.nextInt(nomAtaque.length);
        
        int dano = danoAtaque[indice];
        String ataqueElegido = nomAtaque[indice];

        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre()
         + " con " + ataqueElegido + " causando " + dano  + " puntos de daño ");
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    } // < -- Retorna los puntos de vida actuales
}
