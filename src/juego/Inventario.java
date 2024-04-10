package juego;
import java.util.*;

public class Inventario {
    private ArrayList<Objeto> objetos;

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


    //Creamos los inventarios de cada habitación
    //Entrada
    public static Inventario creaInventarioEntrada(){
        Inventario inventarioEntrada = new Inventario();
        //inventarioEntrada.recogerObjeto(new Objeto("Llave"));
        //inventarioEntrada.recogerObjeto(new Objeto("Espada"));
        return inventarioEntrada;
    }

    //Sala Secreta
    public static Inventario creaInventarioSalaSecreta(){
        Inventario inventarioSalaSecreta = new Inventario();
        //inventarioSalaSecreta.recogerObjeto(new Objeto("Piedra de *nombreInventado*"));//Esta piedra daría +1 al "daño"
        return inventarioSalaSecreta;

    }

    //Sala Central
    public static Inventario creaInventarioSalaCentral(){
        Inventario inventarioSalaCentral = new Inventario();
        //inventarioSalaCentral.recogerObjeto(new Objeto("Gafas Espectrales"));
        return inventarioSalaCentral;
    }

    //Dormitorio
    public static Inventario creaInventarioDormitorio(){
        Inventario inventarioDormitorio = new Inventario();
        //inventarioDormitorio.recogerObjeto(new Objeto("Mochila"));
        return inventarioDormitorio;
    }

    //Patio de Armas
    public static Inventario creaInventarioPatioArmas(){
        Inventario inventarioPatioArmas = new Inventario();
        //inventarioPatioArmas.recogerObjeto(new Objeto("Pistola"));
        return  inventarioPatioArmas;

    }

    public List <Objeto> getObjetos(){
        return this.objetos;
    }
}