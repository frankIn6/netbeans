package obligatorio1;

import java.util.*;

public class Consola extends Sistema {
    
    private Sistema sistema;
    

    public void interfaz() {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        String ingreso
                = """
                  +-+-+-+-+-+-+-+-+-+-+
                     S A L T I T O S
                  +-+-+-+-+-+-+-+-+-+-+
                    Ingresa un número
                  1- Ingresar jugador
                  2- Jugar SALTITOS
                  ----------------------""";
        System.out.println(ingreso);
        opcion = in.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el nombre ");
                String nombre = ingresarPalabra();
                validarNombre(nombre);
                System.out.println("Ingrese su edad");
                int edad = in.nextInt();
                validarEdad(edad);
                in.nextLine();
                System.out.println("Ingrese un alias");
                String alias = ingresarPalabra();
                validarAlias(alias);
                sistema.addJugador(nombre, edad, alias, 0, 0);
            }
                
            case 2 -> System.out.println("ASD");
            
        }

    }

    public static String ingresarPalabra() {
        Scanner in = new Scanner(System.in);
        String palabra;
        palabra = in.nextLine();
        return palabra;
    }

    public String validarNombre(String unNombre) {
        String nombre = unNombre;
        while (nombre.equals("")){
            System.out.println("Ingrese un nombre válido");
            nombre = ingresarPalabra();
        }
        return nombre;
    }
    
    public int validarEdad (int unaEdad){
        Scanner in = new Scanner (System.in);
        int edad = unaEdad;
        while (edad < 0 ){
            System.out.println("Ingrese una edad válida");
            edad = in.nextInt();
        }
        return edad;
    }
    
     public String validarAlias(String unAlias) {
         String alias = unAlias;
         Jugador jugador = new Jugador ();
         boolean ok = false;
         while (!ok){
             if(!sistema.getListaJugadores().contains(alias)){
                 jugador.setAlias(alias);
                 ok = true;
             }
             else{
                 System.out.println("Ingrese un alias válido");
                 alias = ingresarPalabra();
             }
         }
         return alias;
    }

}

