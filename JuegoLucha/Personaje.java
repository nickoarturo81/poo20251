package JuegoLucha;

import java.util.random.*;
import java.util.Scanner;

public class Personaje {
    
    //Atirbutos:
    private String nombre:
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    //Constructores
    public Personaje(String nombre, int puntosDeVida, int MAX_DANO, int MIN_DANO){
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.MAX_DANO = MAX_DANO;
        this.MIN_DANO = MIN_DANO;
    }
}
