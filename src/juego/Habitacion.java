package juego;
import java.util.List;

public class Habitacion {
    private String nombre;
    private String descripcion;
    private Inventario inventario;
    private static Habitacion habitacionNorte;
    private static Habitacion habitacionSur;
    private static Habitacion habitacionEste;
    private static Habitacion habitacionOeste;

    public Habitacion (String nombre, String descripcion, Inventario inventario){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inventario = inventario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String nuevoDescripcion){
        this.descripcion = nuevoDescripcion;
    }

    public Inventario getInventario(){
        return this.inventario;
    }

    public void setInventario(Inventario nuevoInventario){
        this.inventario = nuevoInventario;
    }

    public void setHabitacionNorte(Habitacion nuevoHabitacionNorte){
        Habitacion.habitacionNorte = nuevoHabitacionNorte;
    }

    public void setHabitacionSur(Habitacion nuevoHabitacionSur){
        Habitacion.habitacionSur = nuevoHabitacionSur;
    }

    public void setHabitacionEste(Habitacion nuevoHabitacionEste){
        Habitacion.habitacionEste = nuevoHabitacionEste;
    }

    public void setHabitacionOeste(Habitacion nuevoHabitacionOeste){
        Habitacion.habitacionOeste = nuevoHabitacionOeste;
    }

    public static Habitacion getHabitacionNorte(){
        return habitacionNorte;
    }

    public static Habitacion getHabitacionSur(){
        return habitacionSur;
    }

    public static Habitacion getHabitacionEste(){
        return habitacionEste;
    }

    public static Habitacion getHabitacionOeste(){
        return habitacionOeste;
    }


    //Esto mostrará la info de la hab, podemos usarla para programar y ver resultados
    //Se está usando en el modo extra -> ¿Dónde estoy?
    public void mostrarInfoHabitacion(){
        System.out.println("Habitación " + getNombre());

        Inventario inventarioHabitacion = getInventario();
        List<Objeto> objetosHabitacion = inventarioHabitacion.getObjetos();

        if (!objetosHabitacion.isEmpty()) {
            System.out.println("Objetos que puedes recoger: ");

            for(Objeto objeto : objetosHabitacion){
                System.out.println("- " + objeto.getNombre());
            }
        } else {
            System.out.println("No hay nada que puedas recoger :( ");
        }

    }


    @Override
    public String toString(){
        return "Habitacion{" +
        "nombre='" + nombre + '\'' +
        ", objeto=" + inventario +
        '}';
    }
}
