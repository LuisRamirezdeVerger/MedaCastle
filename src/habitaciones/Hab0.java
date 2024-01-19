package habitaciones;
import juego.*;
import java.util.Scanner;


public class Hab0 {

    private static Scanner sc = new Scanner(System.in);

    public static void muestraInfo (){
        System.out.println("Con mucha confianza, y sin pensarlo dos veces, te sacudes los miedos y cruzas corriendo el puente levadizo.");
        Temp.Temporizador(4000);
        System.out.println("Acabas de entrar en el castillo...");
        Temp.Temporizador(3500);
        System.out.println("¿QUÉ? ¡CUIDADO! ¡Espera! ~*Suena un mecanismo*~");
        Temp.Temporizador(3500);
        System.out.println("Al escuchar la voz de tu compi, te das media vuelta para saber que está pasando...");
        Temp.Temporizador(3500);
        System.out.println("¡¡Oh, f*ck!! ");
        Temp.Temporizador(2000);
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();
        System.out.println(".");
        Temp.Temporizador(2500);
        Temp.LimpiarPantalla();
        System.out.println("..");
        Temp.Temporizador(2500);
        Temp.LimpiarPantalla();
        System.out.println("...");
        Temp.Temporizador(2500);
        System.out.println("Al mirar atrás, ves como el puente se ha cerrado detrás tuya... ");
        Temp.Temporizador(3500);
        System.out.println("¡¡Eh!!- Escuchas un grito detrás del puente levado - Avisaremos a la persona al cargo y vendremos a por ti, intenta buscar alguna salida mientras y no te metas en líos!");
        Temp.Temporizador(2000);
        System.out.println("Presiona Enter para continuar.");
        sc.nextLine();
        
        Temp.LimpiarPantalla();
        Hab1.muestraInfo();
 
    }    

    public static void pistasHab0(){
        //Rellenar
        System.out.println("Pistas de la habitación 0");
    }

    
}