package obligatorio1;

import java.util.*;

public class Juego {

    private Jugador jugadorUno;
    private Jugador jugadorDos;
    private Jugador JugadorActual; // ????
    private Colcha colcha;
    private Consola consola;

    public Juego(Jugador unJugadorUno, Jugador unJugadorDos,
            Jugador unJugadorActual, Colcha unaColcha) {
        this.jugadorUno = unJugadorUno;
        this.jugadorDos = unJugadorDos;
        this.JugadorActual = unJugadorActual;
        this.colcha = unaColcha;
    }

    public Juego() {
        this.jugadorUno = null;
        this.jugadorDos = null;
        this.JugadorActual = null;
        this.colcha = null;
    }

    public void inicializar() {
        Consola consola = new Consola ();
        consola.interfaz();
    
    }

    public String[][] simpleVersion() {
        String[][] colchaSimple = new String[6][6];
        return colchaSimple;
    }

    public String[][] fullVersion() {
        String[][] colchaFull = new String[6][6];
        return colchaFull;
    }

}
