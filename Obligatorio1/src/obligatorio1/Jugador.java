package obligatorio1;

public class Jugador {

    private String nombre;
    private int edad;
    private String alias;
    private int cantGatos;
    private int cantJugadas;
    private int cantGanadas;

    //Constructor
    public Jugador(String unNombre, int unaEdad, String unAlias, int unCantGanadas, int unCantJugadas) {
        this.nombre = unNombre;
        this.edad = unaEdad;
        this.alias = unAlias;
        this.cantGatos = 8; // ?????
        this.cantJugadas = unCantJugadas;
        this.cantGanadas = unCantGanadas;
    }

    public Jugador() {
        this.nombre = "Vacío";
        this.edad = 0;
        this.alias = "Vacío";
        this.cantGatos = 0;
        this.cantGanadas = 0;
        this.cantJugadas = 0;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String unAlias) {
        alias = unAlias;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int unCantJugadas) {
        cantJugadas = unCantJugadas;
    }

    public int getCantGanadas() {
        return cantGanadas;
    }

    public void setCantGanadas(int unCantGanadas) {
        cantGanadas = unCantGanadas;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
                + "\nEdad: " + this.getEdad()
                + "\nAlias: " + this.getAlias()
                + "\nCantidad partidas ganadas: " + this.getCantGanadas()
                + "\nCantidad partidas jugadas: " + this.getCantJugadas();
    }

}
