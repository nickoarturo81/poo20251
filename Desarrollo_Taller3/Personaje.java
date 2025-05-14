package Desarrollo_Taller3;

import java.util.Random;

public class Personaje {
    
    //Atributos:
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    //Constructor
    public Personaje(String nombre){
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    //Métodos
    public String getNombre() {
        return this.nombre;
    } // <-- Retorna el nombre del personaje

    public boolean estaVivo(){
        return this.puntosDeVida > 0;
    } // < -- Verifica si el personaje está vivo

    public void recibirDano (int dano){
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0){
            this.puntosDeVida = 0; // <-- No se puede tener menos de 0 HP
        }
    } // < -- Recibir Daño

    public void atacar(Personaje oponente){
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano ( dano ) ;
        System.out.println( this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño") ;
    } // <-- Realizar un ataque al oponente

    public int getPuntosDeVida(){
        return this.puntosDeVida;
    } // < -- Retorna los puntos de vida actuales
}
