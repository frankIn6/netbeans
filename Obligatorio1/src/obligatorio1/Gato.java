package obligatorio1;

public class Gato {

    private String color;
    private String tamaño;

    //Constructor
    public Gato(String color, String tamaño) {
        this.color = color;
        this.tamaño = tamaño;
    }

    //Metodos
    public String getColor() {
        return color;
    }

    public void setColor(String unColor) {
        color = unColor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String unTamaño) {
        tamaño = unTamaño;
    }
    
    //TO STRING? Gato color rojo y azul
}
