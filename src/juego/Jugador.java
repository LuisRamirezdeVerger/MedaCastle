package juego;

import java.util.*;

public class Jugador {

    private String nombre;
    private int fuerza;
    private int agilidad;
    private int intelecto;
    private int sabiduria;
    private int puntosRestantes;
    private Especializacion especializacion;
    private Scanner sc;

    public Jugador(String nombre, int fuerza, int agilidad, int intelecto, int sabiduria, int puntosRestantes, Especializacion especializacion) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.intelecto = intelecto;
        this.sabiduria = sabiduria;
        this.puntosRestantes = puntosRestantes;
        this.especializacion = especializacion;
    }

    // Setters y getters

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setFuerza(int nuevoFuerza) {
        this.fuerza = nuevoFuerza;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public void setAgilidad(int nuevoAgilidad) {
        this.fuerza = nuevoAgilidad;
    }

    public int getAgilidad() {
        return this.agilidad;
    }

    public void setIntelecto(int nuevoIntelecto) {
        this.fuerza = nuevoIntelecto;
    }

    public int getIntelecto() {
        return this.intelecto;
    }

    public void setSabiduria(int nuevoSabiduria) {
        this.sabiduria = nuevoSabiduria;
    }

    public int getSabiduria() {
        return this.sabiduria;
    }

    public void setPuntosRestantes(int nuevoPuntosRestantes) {
        this.puntosRestantes = nuevoPuntosRestantes;
    }

    public int getPuntosRestantes() {
        return this.puntosRestantes;
    }

    public void setEspecializacion(Especializacion nuevoEspecializacion) {
        this.especializacion = nuevoEspecializacion;
    }

    public Especializacion getEspecializacion() {
        return this.especializacion;
    }

    public void repartirPuntos() {

        System.out.println("Tienes " + getPuntosRestantes() + ". ");

        System.out.println("--- Menú --- \n");
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Agilidad: " + getAgilidad());
        System.out.println("Intelecto: " + getIntelecto());
        System.out.println("Sabiduría: " + getSabiduria());

        System.out.println("Elige una estadística: \n");
        System.out.println("1.- Fuerza ");
        System.out.println("2.- Agilidad ");
        System.out.println("3.- Intelecto ");
        System.out.println("4.- Sabiduría ");
        System.out.println("5.- Salir ");

        // Ejemplo de sumar las estadísticas
        // setFuerza(getFuerza() + sc.nextInt() );
        // Indica que la nueva fuerza será la que ya tiene + la que elija

        try {

            while (getPuntosRestantes() > 0) {

                switch (sc.nextInt()) {

                    case 1:
                        System.out.println("Has elegido -> Fuerza: ");
                        System.out.println("¿Cúantos quieres añadir? ");
                        setFuerza(sc.nextInt() + getFuerza());
                        break;
                    case 2:
                        System.out.println("Has elegido -> Agilidad: ");
                        System.out.println("¿Cúantos quieres añadir? ");
                        setAgilidad(sc.nextInt() + getAgilidad());
                        break;
                    case 3:
                        System.out.println("Has elegido -> Intelecto: ");
                        System.out.println("¿Cúantos quieres añadir? ");
                        setIntelecto(sc.nextInt() + getIntelecto());
                        break;
                    case 4:
                        System.out.println("Has elegido -> Sabiduría: ");
                        System.out.println("¿Cúantos quieres añadir? ");
                        setSabiduria(sc.nextInt() + getSabiduria());
                        break;
                    case 5:
                        System.out.println("Saliendo ... ");
                        break;
                    default:
                        System.out.println("Elige una opción correcta. ");
                        break;
                }

            }

        } catch (Exception e) {
            System.out.println("Error, valor no válido. ");
        } // Añadir más específicos catch (Exception x){

        // }

        // Sistema repartir puntos
        sc.close();
    }

    public void comprobarPuntos() {

        System.out.println("Tienes " + getPuntosRestantes() + " puntos de estadísticas restantes. ");
        System.out.println(" --- Estadísticas --- \n");
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Agilidad: " + getAgilidad());
        System.out.println("Intelecto: " + getIntelecto());
        System.out.println("Sabiduría: " + getSabiduria());
    }

}
