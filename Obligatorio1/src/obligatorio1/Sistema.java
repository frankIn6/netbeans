package obligatorio1;

import java.util.*;

public class Sistema {
    
    //Atributos
    private ArrayList<Jugador> listaJugadores = new ArrayList<>();
    Juego juego = new Juego ();
    
    //Metodos
    public Sistema (){
        listaJugadores = new ArrayList<Jugador>();
    }
    
    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }
    
    public void addJugador(String nombre, int edad, String alias, int cantJugadas, int cantGanadas) {
        Jugador jugador = new Jugador(nombre, edad, alias, cantJugadas, cantGanadas);
        this.listaJugadores.add(jugador);
    }
    
    public int jugadorComienza(){
        return (int)(Math.random()*2+1);
    }
    
    public void iniciarJuego (){
        juego.inicializar();
    }
    

}

