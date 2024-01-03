package juego;

public class Objeto {
    private String nombre;
    //Podemos introducir descripcion y durabilidad

    public Objeto (String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
