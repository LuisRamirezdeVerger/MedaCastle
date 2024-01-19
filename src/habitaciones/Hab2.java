package habitaciones;
import juego.*;
import java.util.*;

public class Hab2 {

    public static Scanner sc = new Scanner(System.in);

    public static void muestraInfo (){
        // System.out.println("El pasillo movedizo");
        // Temp.Temporizador(2500);
        System.out.println("Entras en el pasillo y te paras. Parece un pasillo normal, pero sabes que no lo será.");
        Temp.Temporizador(2500);
        System.out.println("Das un paso dudoso y piensas que tienes que tener más decisión si quieres llegar a la siguiente habitación.");
        Temp.Temporizador(2500);
        System.out.println("Respiras hondo y comienzas a caminar. Entornas los ojos y de repente suena un ruido de engranajes.");
        Temp.Temporizador(2500);
        System.out.println("¡Mierda! Las paredes del pasillo comienzan a cerrarse lentamente y cada sonido del engranaje se clava en tus entrañas.");
        Temp.Temporizador(2500);
        System.out.println("Está bien -piensas-, es el momento de pensar rápido si no quiero morir en versión 2D.");
        Temp.Temporizador(2500);
        System.out.println("Sólo tienes dos opciones y tienes que salir rápido de este pasillo. Las paredes se siguen cerrando y casi puedes tocarlas con ambas manos a la vez. ");
        Temp.Temporizador(2500);
        System.out.println("Sigue hacia delante o gira a la derecha. ¡DECIDE! ¡¡VAMOS!! ");
        Temp.Temporizador(2500);
        System.out.println("Elige una opción: \n");
        System.out.println("1.- Hacia adelante ");
        System.out.println("2.- Hacia la izquierda");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("No hay lugar a mirar otra cosa, sin dudar, corres... ");
                Temp.Temporizador(2500);
                System.out.println("¿Qué? Lo que parecía ser una puerta, era un simple dibujo en la pared. ");
                Temp.Temporizador(2500);
                System.out.println("Quizás hasta aquí se ha llegado... -Te replanteas... ");
                Temp.Temporizador(2500);
                System.out.println("Entre paredes, cada vez más cerca, divisas la puerta. La real. ");
                Temp.Temporizador(2500);
                System.out.println("...");
                Temp.Temporizador(2500);
                System.out.println("*CRaaAAaaAANK*");
                Temp.Temporizador(2500);
                System.out.println("Ves como la puerta se ha abierto, al mirar, una sombra desaparece en un parpadeo...");
                Temp.Temporizador(2500);
                System.out.println("No sabes lo que ha pasado, pero no hay tiempo que perder. ");
                Temp.Temporizador(2500);
                System.out.println("Con la pared rozando tu espalda y pecho a la vez, corres lateralmente tan rápido como puedes.");
                Temp.Temporizador(2500);
                System.out.println("...");
                Temp.Temporizador(4000);
                System.out.println("¡Sí! ¡Conseguido! Justo cuando cruzas la puerta, las paredes del pasillo terminan de cerrarse. En ese momento, la puerta se cierra de golpe...");
                Temp.Temporizador(2500);
                System.out.println("No es la primera vez que pasa. Te sacudes el polvo de tu ropa y te dispones");
                //fase 
                Hab5.muestraInfo();
                break;
            case 2: 
                System.out.println("Con el corazón en el puño, reúnes valentía suficiente como para controlar tu cuerpo. ");
                Temp.Temporizador(2500);
                System.out.println("¡Sí! ¡Conseguido! Justo cuando cruzas la puerta, se cierra de golpe...");
                Temp.Temporizador(2500);
                System.out.println("*Resoplas* No es la primera vez que pasa. Te sacudes el polvo y te dispones a seguir. ");
                //fase
                
                break;
        
            default:
                System.out.println("Whoops! Opción inválida >.<'");
                break;
        }
    }

    public static void pistasHab2(){
        //Rellenar
        System.out.println("Pistas de la habitación 2");
    }

        
}