package juego;
import habitaciones.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Mapa juegoMapa = new Mapa();
		//juegoMapa.mostrarMapa();

		while (juegoMapa.isJuegoEnCurso()) {
			//Empieza el juego
			//Hay que meter la intro
			//Mapa.textoIntroTuto();
			Tuto.textoIntroTuto();
			mostrarMenu();

			// Input del jugador
			int eleccionJugador = opcionUsuario(scanner);

			switch (eleccionJugador) {
				case 1:
					//Let's madafacking GO
					break;
				case 2:
					//Let's madafacking GO
					
					break;
				case 5:
					
					System.out.println("---- Menú Extra ----\n");
        			System.out.println("1.- ¿Dónde estoy? ");
        			System.out.println("2.- Ver inventario. ");
        			System.out.println("3.- Volver al menú. ");
					int eleccionJugadorExtra = opcionUsuario(scanner);
					switch (eleccionJugadorExtra) {
						case 1:
							juegoMapa.mostrarInfoHabitacionActual();
							break;
					
						default:
							//Mensaje de error
							break;
					}
					
				break;
			
				default:
					//Mensaje de error
					break;
			}

		}
		System.out.println("Mensaje de finalización. ");
	}

	private static void mostrarMenu(){
        System.out.println("---- Menú ----\n");
        System.out.println("1.- Buscar pistas. ");
        System.out.println("2.- Recoger objeto encontrado. ");
        System.out.println("3.- Moverse. ");
        System.out.println("4.- Combate. ");
        System.out.println("5.- Extra. ");
        System.out.println("6.- Salir del juego. ");
        System.out.println("Elige una opción: ");
    }

	private static int opcionUsuario(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println("Escoge un número válido. ");
			scanner.next(); //Limpia el bufer del scanner
		}
		return scanner.nextInt();
	}

}
