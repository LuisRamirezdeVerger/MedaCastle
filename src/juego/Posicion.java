package juego;

public class Posicion {
    private int x, y;

    public Posicion (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int nuevoX){
        this.x = nuevoX;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int nuevoY){
        this.y = nuevoY;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
