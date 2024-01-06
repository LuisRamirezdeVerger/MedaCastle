package juego;
import habitaciones.*;
import java.util.List;

public class Habitacion {
    private String nombre;
    private String descripcion;
    private Inventario inventario;
    //private Tuto textoIntro;

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

    // public Tuto getTextoIntro(){
    //     return this.textoIntro;
    // }

    //Esto mostrará la info de la hab, podemos usarla para programar y ver resultados
    //Se está usando en el modo extra -> ¿Dónde estoy?
    public void mostrarInfoHabitacion(){
        System.out.println("Habitación " + nombre);

        Inventario inventarioHabitacion = getInventario();
        List<Objeto> objetosHabitacion = inventarioHabitacion.getObjetos();

        if (!objetosHabitacion.isEmpty()) {
            System.out.println("Objetos que puedes recoger: ");

            for(Objeto objeto : objetosHabitacion){
                System.out.println("- " + objeto.getNombre());
            }
        } else {
            System.out.println("No hay nada que puedas recoger. ");
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
