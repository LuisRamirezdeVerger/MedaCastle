package juego;
import habitaciones.*;
import java.util.*;

public class Main {

	private static Posicion posicionJugador;
	private static Habitacion[][] habitaciones;
	private static Inventario inventario;
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
					buscarPistas();
					break;
				case 2:
					Objeto objetoEncontrado = objetoParaRecoger();
					recogerObjetoEncontrado(objetoEncontrado);
					break;
				case 5:
					//Menú extra
					System.out.println("---- Menú Extra ----\n");
        			System.out.println("1.- ¿Dónde estoy? ");
        			System.out.println("2.- Ver inventario. ");
        			System.out.println("3.- Volver al menú. ");
					int eleccionJugadorExtra = opcionUsuario(scanner);
					switch (eleccionJugadorExtra) {
						case 1:
							juegoMapa.mostrarInfoHabitacionActual();
							break;
						case 2:
							//Mostrar inventario
							
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

	//Por terminar
	private static void buscarPistas(){
		Habitacion habitacionActual = habitaciones[posicionJugador.getX()][posicionJugador.getY()];

		String nombreHabitacion = habitacionActual.getNombre();
		switch (nombreHabitacion) {
			case "Entrada":
			//Ejemplo: Tuto.texto...(); no va ahí
				Tuto.textoIntro();
				break;
			case "Sala Secreta":
			//Lo mismo
				Tuto.textoIntroFinal();
				break;
		
			default:
				break;
		}

		//Con este bloque, hacemos que los objetos de la habitacion pasen a "encontrados" y se puedan lootear
		Inventario inventarioHabitacion = habitacionActual.getInventario();
		List<Objeto> objetosHabitacion = inventarioHabitacion.getObjetos();

		for (Objeto objeto : objetosHabitacion) {
			if (!objeto.getEncontrado()) {
				objeto.setEncontrado(true);
				System.out.println("Has encontrado " + objeto.getNombre());
				inventario.recogerObjeto(objeto);
			}
		}
	}

	private static void recogerObjetoEncontrado(Objeto objeto){
		if (objeto.getEncontrado()) {
			inventario.recogerObjeto(objeto);
			System.out.println("Has recogido " + objeto.getNombre());
		} else {
			System.out.println("No hay objetos que recoger. ¿Has buscado bien?");
		}

	}

	private static Objeto objetoParaRecoger(){
		Habitacion habitacionActual = habitaciones[posicionJugador.getX()][posicionJugador.getY()];
		Inventario inventarioHabitacion = habitacionActual.getInventario();
		List<Objeto> objetosHabitacion = inventarioHabitacion.getObjetos();

		for (Objeto objeto : objetosHabitacion) {
			if (!objeto.getEncontrado()) {
				objeto.setEncontrado(true);
				inventario.recogerObjeto(objeto);
				return objeto;
			}
		}
		return null;
		
	}

}
