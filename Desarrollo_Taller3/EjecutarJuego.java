package Desarrollo_Taller3;

import java.util.Scanner;

public class EjecutarJuego {
    // Metodo principal que ejecuta el juego
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo para almacenar lista de personajes
        Personaje[] personajesDispo = {
            new Scorpion("Scorpion"), new SubZero("SubZero"), new LiuKang("LiuKang")
        }; // < -- Crea un menú a partir de las subclases de Personaje

        System.out.println("Selecciona el personaje");
        for (int i = 0; i < personajesDispo.length; i++) {
            System.out.println((i + 1 + ". " + personajesDispo[i].getNombre()));
            ;
        }

        // Elegir personaje #1
        System.out.print("Jugador 1: Elige tu luchador, seleccione un número de (1 - " + personajesDispo.length + " )");
        int eleccion1 = scanner.nextInt() - 1;

        while (eleccion1 < 0 || eleccion1 >= personajesDispo.length) {
            System.out.print("Elección inválida. Intenta de nuevo: ");
            eleccion1 = scanner.nextInt() - 1;
        }
        // Elegir personaje #2
        System.out.print("Jugador 2: Elige tu luchador, seleccione un número de (1 - " + personajesDispo.length + " )");
        int eleccion2 = scanner.nextInt() - 1;

        while (eleccion2 < 0 || eleccion2 >= personajesDispo.length || eleccion2 == eleccion1) {
            System.out.print("Elección inválida o luchador ya elegido. Intenta de nuevo: ");
            eleccion2 = scanner.nextInt() - 1;
        }
        // Crear juego con los personajes seleccionados
        Personaje jugador1 = personajesDispo[eleccion1];
        Personaje jugador2 = personajesDispo[eleccion2];

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();
        scanner.close();

    }
}
