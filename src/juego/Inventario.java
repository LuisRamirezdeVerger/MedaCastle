package juego;
import java.util.*;

public class Inventario {
    private List<Objeto> objetos;

    public Inventario(){
        this.objetos = new ArrayList<>();
    }

    public void recogerObjeto(Objeto objeto){
        objetos.add(objeto);
        System.out.println("Has recogido: " + objeto.getNombre() + ". ");
    }

    public void mostrarInventario(){
        if (getObjetos().isEmpty()){
            System.out.println("No tienes nada en el inventario, aún... ");
        } else {
            System.out.println("Inventario: \n");
            for (Objeto objeto : objetos){
                System.out.println("- " + objeto.getNombre());
            }
        }
    }

    public List <Objeto> getObjetos(){
        return this.objetos;
    }
}