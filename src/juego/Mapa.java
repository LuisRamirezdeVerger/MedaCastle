package juego;

import java.util.Scanner;

//import java.util.*;

public class Mapa {
    //Recuerda preguntar si tener varios privates con los mismos nombres es redundante
    private static Habitacion[][] habitaciones;
    private static Posicion posicionJugador;
    private boolean juegoEnCurso;
    //private Inventario inventario;
    //private static Scanner sc = new Scanner(System.in);

    public Mapa() {
        habitaciones();
        // Establecemos posicion inicial, queremos empezar en la 2ª casilla del 3er array
        posicionJugador = new Posicion(2, 0);
        //inventario = new Inventario();
        juegoEnCurso = true;
        mostrarInfoHabitacionActual();

    }

    public static void habitaciones(){
        habitaciones = new Habitacion[3][3];
        //Habitacion habitacionActual = habitaciones[posicionJugador.getX()][posicionJugador.getY()];
        //Completa las habitaciones!
     
        habitaciones[0][0] = new Habitacion("Aseos", "AseosDescripción", new Inventario());
        habitaciones[0][0].setHabitacionEste(habitaciones[0][1]);
        habitaciones[0][0].setHabitacionSur(habitaciones[1][0]);

        habitaciones[0][1] = new Habitacion("Almenara", "Descripción almenara", new Inventario()); //Podemos poner que busquen madera y tenga que encender el fuego
        habitaciones[0][1].setHabitacionOeste(habitaciones[0][0]);
        habitaciones[0][1].setHabitacionEste(habitaciones[0][2]);
        habitaciones[0][1].setHabitacionSur(habitaciones[1][1]);

        habitaciones[0][2] = new Habitacion("Sala de torturas", "Descripción de la Sala de torturas", new Inventario());
        habitaciones[0][2].setHabitacionOeste(habitaciones[0][1]);

        habitaciones[1][0] = new Habitacion("Dormitorio", "Descripción del dormitorio", new Inventario());
        habitaciones[1][0].setHabitacionNorte(habitaciones[0][0]);
        habitaciones[1][0].setHabitacionEste(habitaciones[1][1]);

        habitaciones[1][1] = new Habitacion("Sala Central", "Descripción de la sala central", creaInventarioSalaCentral());
        habitaciones[1][1].setHabitacionNorte(habitaciones[0][1]);
        habitaciones[1][1].setHabitacionSur(habitaciones[2][1]);
        habitaciones[1][1].setHabitacionEste(habitaciones[1][2]);
        habitaciones[1][1].setHabitacionOeste(habitaciones[1][0]);

        habitaciones[1][2] = new Habitacion("Patio de Armas", "Descripcion Patio de Armas", new Inventario());
        habitaciones[1][2].setHabitacionSur(habitaciones[2][2]);
        habitaciones[1][2].setHabitacionOeste(habitaciones[1][1]);
        
        habitaciones[2][0] = new Habitacion("Entrada", "Punto de inicio", creaInventarioEntrada()); 
        habitaciones[2][0].setHabitacionEste(habitaciones[2][1]);

        habitaciones[2][1] = new Habitacion("Pasillo movedizo", "Las paredes se mueven. ", null); //Si lo ponemos así, en esta habitación no se lootea nada
        habitaciones[2][1].setHabitacionNorte(habitaciones[1][1]);
        habitaciones[2][1].setHabitacionOeste(habitaciones[2][0]);

        habitaciones[2][2] = new Habitacion("Sala Secreta", "decripcion02", creaInventarioSalaSecreta());
        habitaciones[2][2].setHabitacionNorte(habitaciones[1][2]);

    }

    //Creamos los inventarios de cada habitación
    private static Inventario creaInventarioEntrada(){
        Inventario inventarioEntrada = new Inventario();
        inventarioEntrada.recogerObjeto(new Objeto("Llave"));
        inventarioEntrada.recogerObjeto(new Objeto("Espada"));
        return inventarioEntrada;
    }

    private static Inventario creaInventarioSalaSecreta(){
        Inventario inventarioSalaSecreta = new Inventario();
        inventarioSalaSecreta.recogerObjeto(new Objeto("Piedra de *nombreInventado*"));//Esta piedra daría +1 al "daño"
        return inventarioSalaSecreta;

    }

    private static Inventario creaInventarioSalaCentral(){
        Inventario inventarioSalaCentral = new Inventario();
        inventarioSalaCentral.recogerObjeto(new Objeto("Gafas Espectrales"));
        return inventarioSalaCentral;
    }


    //Terminan los inventarios (Plantea llevarlos a otro archivo para una mayor legibilidad de código)


    //Método para tener la posición del jugador -- NOTA!! "Para tener = get(getters!!)"
    public void mostrarInfoHabitacionActual(){
        Habitacion habitacionActual = habitaciones[posicionJugador.getX()][posicionJugador.getY()];
        habitacionActual.mostrarInfoHabitacion();
    }

    public static void habitacionActual(){
        //Habitacion habitacionActual = habitaciones[posicionJugador.getX()][posicionJugador.getY()];
    }

    public void mostrarMapa() {
            for (int i = 0; i < habitaciones.length; i++) {
                for (int j = 0; j < habitaciones[i].length; j++) {
                    if (i == posicionJugador.getX() && j == posicionJugador.getY()) {
                        System.out.println("Estás en " + habitaciones[i][j].getNombre() + " . ");
                    } else {
                        System.out.println(habitaciones[i][j].getNombre() + "");
                    }
                }
                System.out.println();
            }
   
        //Piensa donde usar todo esto
        // Verificamos si hay objetos en la hab actual
        // ............................................ \\
        //inventario.mostrarInventario();
    }

    //Movimiento

    public static void manejarMovimiento(Scanner scanner){
        System.out.println("Elige una dirección: ");
        String direccion = scanner.next().toLowerCase();

        switch (direccion) {
            case "norte":
                moverse(direccion);
                break;
            case "sur":
                moverse(direccion);
                break;
            case "este":
                moverse(direccion);
                break;
            case "oeste":
                moverse(direccion);
                break;
            default:
                System.out.println("Elige una dirección correcta. ");
                break;
        }
    }

    public static void moverse(String direccion){
        Habitacion nuevaHabitacion = null;
        
        switch (direccion) {
            case "norte":
                nuevaHabitacion = Habitacion.getHabitacionNorte();                
                break;
                case "sur":
                nuevaHabitacion = Habitacion.getHabitacionSur();                
                break;
                case "este":
                nuevaHabitacion = Habitacion.getHabitacionEste();                
                break;
                case "oeste":
                nuevaHabitacion = Habitacion.getHabitacionOeste();                
                break;
            default:
                break;
        }

        //Es posible que las coordenadas haya que meteras en array
        if (nuevaHabitacion != null) {
            posicionJugador = new Posicion(posicionJugador.getX(), posicionJugador.getY());
        } else {
            System.out.println("No puedes ir en esa dirección. ");
        }
    }

    //Termina movimiento

    public boolean isJuegoEnCurso(){
        return juegoEnCurso;
    }

}
    
