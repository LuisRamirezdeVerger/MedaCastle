package juego;

public class Objeto {
    private String nombre;
    private boolean encontrado;
    //Podemos introducir descripcion y durabilidad

    public Objeto (String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean getEncontrado(){
        return this.encontrado;
    }

    public void setEncontrado(boolean nuevoEncontrado){
        this.encontrado = nuevoEncontrado;
    }
}
