package Desarrollo_Taller3;

public class JuegoLucha {
    
    //Atributos
    private Personaje jugador1;
    private Personaje jugador2;

    //Constructor
    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    //Métodos

    //iniciarPelea()
    public void iniciarPelea() {
        System.out.println();
        System.out.println("Pelea entre: " + jugador1.getNombre() + " VS " + jugador2.getNombre() + "..."); 
        System.out.println("Round One ¡Fight!");

        //Bucle del combate
        while (jugador1.estaVivo() && jugador2.estaVivo()) { // <-- Mientras ambos luchadores esten vivos se alternan los turnos
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()){
                turno(jugador2, jugador1);
            }
        }
        //Fin del combate
        if (jugador1.estaVivo()){
            System.out.println(jugador1.getNombre() + " WINS \nFlawless Victory"); // <-- Si el jugador 1 sigue vivo, muestra su mensaje de victoria
        } else {
            System.out.println(jugador2.getNombre() + " WINS \nFlawless Victory"); // <-- Si no, el jugador 2 sigue vive, muestra su mensaje de victoria
        }

    }

    private void turno (Personaje atacante, Personaje defensor) {
        System.out.println("----------------------------------------------------");
        System.out.println("Turno de " + atacante.getNombre());                                                         // <-- Muestra quien atacara de primero 
        System.out.println("Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());            // <-- Muestra los puntos de vida actuales del oponente 
        atacante.atacar(defensor);                                                                                      // <-- Se ejecuta el ataque del personaje que tiene el turno
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida");    
        System.out.println("----------------------------------------------------");
        
        try {
            Thread.sleep(1000); // Pausa de 1 segundo entre turnos, es decir, imprime turno por turno y evitar imprimir todos a la vez.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}
    


