package Desarrollo_Taller3;

import java.util.Random;
import java.util.Scanner;

public class Personaje {
    
    //Atributos:
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    //Constructor
    public Personaje(String nombre, int puntosDeVida, int MAX_DANO, int MIN_DANO){
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }
}
