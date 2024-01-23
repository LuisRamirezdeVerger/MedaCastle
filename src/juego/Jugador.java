package juego;

import java.util.Scanner;

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
        this.sabiduria = nuevoSabiduria;
    }

    public int getSabiduria(){
        return this.sabiduria;
    }

    public void setPuntosRestantes (int nuevoPuntosRestantes){
        this.puntosRestantes = nuevoPuntosRestantes;
    }

    public int getPuntosRestantes(){
        return this.puntosRestantes;
    }
    
    public void setRaza(Raza nuevoRaza){
        this.raza = nuevoRaza;
    }

    public Raza getRaza(){
        return this.raza;
    }
    
    public void repartirPuntos(){
     
        System.out.println("Tienes " + getPuntosRestantes() + ". ");
        
        System.out.println("--- Menú --- \n");
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Agilidad: " + getAgilidad());
        System.out.println("Intelecto: " + getIntelecto());
        System.out.println("Sabiduría: " + getSabiduria());

        System.out.println("Elige una estadística: \n");
        System.out.println("1.- Fuerza " );
        System.out.println("2.- Agilidad " );
        System.out.println("3.- Intelecto ");
        System.out.println("4.- Sabiduría ");
        //scEst == Escánner Estadísticas
        Scanner scEst = new Scanner(System.in);
       

        switch (scEst.nextInt()) {
            
            case 1:
                System.out.println("Has elegido -> Fuerza " );
                System.out.println("¿Cúantos quieres añadir?");
                Scanner scPnt = new Scanner(System.in);
                //Pregunta aquí!!
                //int nuevoFuerza = scPnt.nextInt();
                //setFuerza(getFuerza() + nuevoFuerza);
                setFuerza(scPnt.nextInt() + getFuerza()); 
                break;
            //CopyPaste cambiando nombres y variables a las estadísticas existentes
            case 2:
                break;
        
            case 3:   
                break;
        
            case 4:            
                break;
        
            default:
                System.out.println("Elige una opción correcta. ");
                break;
        }
        //Sistema repartir puntos
        scEst.close();
    }

    public void comprobarPuntos(){

        System.out.println("Tienes " + getPuntosRestantes() + ". ");
        System.out.println(" --- Estadísticas --- \n");
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Agilidad: " + getAgilidad());
        System.out.println("Intelecto: " + getIntelecto());
        System.out.println("Sabiduría: " + getSabiduria());
    }    

}
