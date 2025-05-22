package Desarrollo_Taller3;

public class JuegoLucha {
    
    //Atributos
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    //Métodos
    public void iniciarPelea() {
        System.out.println();
        System.out.println("Pelea entre: " + jugador1.getNombre() + " VS " + jugador2.getNombre() + "..."); 
        System.out.println("Round One ¡Fight!");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()){
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()){
            System.out.println(jugador1.getNombre() + " WINS \nFlawless Victory");
        } else {
            System.out.println(jugador2.getNombre() + " WINS \nFlawless Victory");
        }

    }

    private void turno (Personaje atacante, Personaje defensor) {
        System.out.println("----------------------------------------------------");
        System.out.println("Turno de " + atacante.getNombre());
        System.out.println("Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida");
        System.out.println("----------------------------------------------------");
        
        try {
            Thread.sleep(1000); // Pausa de 1 segundo entre turnos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}
    


