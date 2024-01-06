package juego;

import java.util.*;

public class Mapa {
    private Habitacion[][] habitaciones;
    private Posicion posicionJugador;
    private boolean juegoEnCurso;
    private Inventario inventario;
    private boolean objetoEncontrado;
    private static Scanner sc = new Scanner(System.in);

    public Mapa() {
        habitaciones();
        // Establecemos posicion inicial, queremos empezar en la 2ª casilla del 3er array
        posicionJugador = new Posicion(2, 1);
        inventario = new Inventario();
        juegoEnCurso = true;
        objetoEncontrado = false;
        mostrarInfoHabitacionActual();

    }

    public void habitaciones(){
        habitaciones = new Habitacion[3][3];
        //Completa las habitaciones!
        habitaciones[0][0] = new Habitacion("Baños", "descripcion00", new Inventario());
        habitaciones[0][1] = new Habitacion("Habitacion2", "decripcion01", new Inventario());
        habitaciones[0][2] = new Habitacion("Habitacion3", "decripcion02", new Inventario());
        //Mejora las descripciones! Busca la manera de implementar los temporizadores
        habitaciones[1][0] = new Habitacion("Habitacion4", "descripcion10", new Inventario());
        habitaciones[1][1] = new Habitacion("Sala central", "Descripción de la sala central", new Inventario());
        habitaciones[1][2] = new Habitacion("Habitacion6", "decripcion12", new Inventario());
        //
        habitaciones[2][0] = new Habitacion("Entrada", "Punto de inicio", null);//En esta habitación no se lootea nada
        habitaciones[2][1] = new Habitacion("Pasillo movedizo", "Las paredes se mueven. ", creaInventarioEntrada());
        habitaciones[2][2] = new Habitacion("Sala Secreta", "decripcion02", creaInventarioSalaSecreta());
    }

    private Inventario creaInventarioEntrada(){
        Inventario inventarioEntrada = new Inventario();
        inventarioEntrada.recogerObjeto(new Objeto("Llave"));
        inventarioEntrada.recogerObjeto(new Objeto("Espada"));
        return inventarioEntrada;
    }

    private Inventario creaInventarioSalaSecreta(){
        Inventario inventarioSalaSecreta = new Inventario();
        inventarioSalaSecreta.recogerObjeto(new Objeto("Piedra de poder"));//Esta piedra da +1 al contador de kills
        return inventarioSalaSecreta;

    }

    public void mostrarInfoHabitacionActual(){
        Habitacion habitacionActual = habitaciones[posicionJugador.getX()][posicionJugador.getY()];
        habitacionActual.mostrarInfoHabitacion();
    }

    public void mostrarMapa() {
        //if (juegoEnCurso) {
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
        //}
   
        //Piensa donde usar todo esto
        // Verificamos si hay objetos en la hab actual
        // ............................................ \\
        //inventario.mostrarInventario();
    }

    public boolean isJuegoEnCurso(){
        return juegoEnCurso;
    }

}
    
