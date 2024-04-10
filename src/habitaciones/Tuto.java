package habitaciones;
import juego.*;
import java.util.*;

public class Tuto {

    private static Scanner sc = new Scanner(System.in);

    public static void textoIntroTuto (){

        Temp.LimpiarPantalla();
        System.out.println("¡Bienvenid@s al interciclo de 1º de Desarrollo de Aplicaciones Multiplataforma!");
        Temp.Temporizador(2500); //Creamos una espera, así el jugador no se satura con "tanto texto"
        System.out.println("Hemos preparado una pequeña demo de un juego. En este caso es...  ");
        Temp.Temporizador(2500);
        System.out.println("Bueno, ahora lo veréis1... ¡Esperamos que os guste! :)");
        Temp.Temporizador(2500);
        System.out.println("Como podéis comprobar, el juego carece de gráficos. Por tanto, sugerimos que leáis detenidamente. La respuesta puede estar en el texto... ");
        Temp.Temporizador(2500);
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();  //Creamos una pausa para que el jugador interactúe
        Temp.LimpiarPantalla(); //Aquí limpiamos la pantalla para no sobrecargar la pantalla
        System.out.println("En serio...");
        Temp.Temporizador(3100);
        Temp.LimpiarPantalla();
        Temp.Temporizador(1200);
        Temp.LimpiarPantalla();
        System.out.println("...");
        Temp.Temporizador(1500);
        System.out.println("Responde con cuidado... ");
        Temp.Temporizador(2500);
        Temp.LimpiarPantalla();
        System.out.println("¡Esperamos que lo disfrutéis!");
        Temp.Temporizador(2000);
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla(); 
       
    }

    public static void textoIntro(){
        System.out.println("¡Por fin acabó el trimestre!");
        Temp.Temporizador(2500);
        System.out.println("Tú y tus amigos habéis quedado para unas vacaciones en un camping.");
        Temp.Temporizador(2500);
        System.out.println("Al llegar, dejáis vuestras pertenencias en el bungaloo asignado.");
        Temp.Temporizador(2500);
        System.out.println("*TOC, TOC, TOC!* Llaman a la puerta...");
        Temp.Temporizador(2500);
        System.out.println("¿Se puede? - Pregunta alguien con voz masculina...");
        Temp.Temporizador(2500);
        System.out.println("Perdonad chicos, pero parece que tenemos un problema con las instalaciones.");
        Temp.Temporizador(2500);
        System.out.println("-'Parece ser quien se encarga.'-");
        Temp.Temporizador(2500);
        System.out.println("Necesitamos que dejéis las instalaciones tan solo una hora. Para entonces todo estará resuelto.");
        Temp.Temporizador(2500);
        System.out.println("Sabemos que acabáis de llegar, nos ha surgido un imprevisto. Os recompensaremos por las molestias. ");
        Temp.Temporizador(2500);
        System.out.println("Estamos en terrenos de 'Lord Medac', Conde de estas tierras. Si miráis al norte al salir, veréis su castillo. ¡Es una gran atracción en el lugar!");
        Temp.Temporizador(2000);
        System.out.println("Bueno, he de seguir con la ruta de aviso, luego nos vemos. ¡Disfrutad de la exploración!");
        Temp.Temporizador(2000);
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla(); 
    }

    public static void textoIntroFinal (){
        System.out.println("- ¡Bien! Tampoco tenemos nada mejor que hacer, vayamos al castillo!. ~ Exclama un compañero ~ A todos os parece una buena idea, y sin dudar, partís.");
        Temp.Temporizador(3500);
        System.out.println("Seguís las indicaciones de la persona al cargo, y, tras 9 minutos, llegáis al castillo.");
        Temp.Temporizador(3500);        
        System.out.println("Es un castillo de lo más normal, con su puente levadizo, torretas para catapultas y varios puntos estrátegicos necesarios en la época.");
        Temp.Temporizador(3500);
        System.out.println("Está un poco en ruinas, tiene varias brechas en los muros, el río está seco y... Ahora que lo miras detenidamente, tu corazón empieza a acelerarse.");
        Temp.Temporizador(3500);
        System.out.println("Sientes una extraña sensación y te planteas dar media vuelta...");
        Temp.Temporizador(3500);
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();
        System.out.println("¿Uh? Estás bien, colega? -Te preguntan.");
        System.out.println("Elige tu respuesta: ");
        System.out.println("");
        System.out.println("\nMenú: ");
		System.out.println("1.- Sí.");
		System.out.println("2.- No.");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Perfecto! Justo ahí tenemos el castillo. ENTREMOS!!");
                sc.nextLine();
                break;
            case 2:
                System.out.println("Tranqui. Esos son los nervios de entrar al castillo. ¡Me pasa lo mismo! No te preocupes, lleva años en desuso y es una atracción como nos dijeron.");
                sc.nextLine();
                break;
            default:
                System.out.println("¿Cómo? No entendí bien");
                break;
        }
    }
        
}