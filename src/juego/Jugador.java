package juego;

public class Jugador {

    private String nombre;
    private int fuerza;
    private int agilidad;
    private int intelecto;
    private int sabiduria;
    private int puntosRestantes;
    private Raza raza;
    
    public Jugador(String nombre, int fuerza, int agilidad, int intelecto, int sabiduria, int puntosRestantes, Raza raza){
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.intelecto = intelecto;
        this.sabiduria = sabiduria;
        this.puntosRestantes = puntosRestantes;
        this.raza = raza;
    }

    //Setters y getters

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setFuerza(int nuevoFuerza){
        this.fuerza = nuevoFuerza;
    }

    public int getFuerza(){
        return this.fuerza;
    }

    public void setAgilidad(int nuevoAgilidad){
        this.fuerza = nuevoAgilidad;
    }

    public int getAgilidad(){
        return this.agilidad;
    }

    public void setIntelecto(int nuevoIntelecto){
        this.fuerza = nuevoIntelecto;
    }

    public int getIntelecto(){
        return this.intelecto;
    }

    public void setSabiduria(int nuevoSabiduria){
        this.fuerza = nuevoSabiduria;
    }

    public int getSabiduria(){
        return this.sabiduria;
    }
    
    public void setRaza(Raza nuevoRaza){
        this.raza = nuevoRaza;
    }

    public Raza getRaza(){
        return this.raza;
    }

}
