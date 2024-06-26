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
		inventario = new Inventario();
		posicionJugador = new Posicion(2, 0);

		while (Mapa.isJuegoEnCurso(true)) {
			
			//Empieza el juego
			//Tuto.textoIntroTuto(); ...

			//Es un simple ejemplo, Nombre será un scanner y se cambiará con P1.setNombre();, lo mismo para la raza, pero en este caso, crearemos un Switch
			//Mejor sería crear una interfaz "iCreaPersonaje(por ejemplo) y darle los métodos buscarPistas(), recogerObjeto()..."
			Jugador p1 = new Jugador(null, 0, 0, 0, 0, 20, null);

			//Bienvenida de juego aquí. Introducir en el package "habitaciones"
			mostrarMenu();

			//Crear bloque try/catch para manejar los errores de eleccionJugador
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
				case 3:
					//Podemos no decir qué tienen que poner y hacer pensar al jugador
					System.out.println("¿En que dirección quieres moverte? ");
					String direccion = scanner.next().toLowerCase();
					Mapa.moverse(direccion);
					//Línea siguiente debe borrarse, solo para testear
					juegoMapa.mostrarInfoHabitacionActual();
					break;
				case 4:
					//Sistema de combate
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
							inventario.mostrarInventario();
							break;
						default:
							//Mensaje de error en menú extra
							break;
					}
					break;
				case 6:
					Mapa.isJuegoEnCurso(false);
					break;
			
				default:
					//Mensaje de error en menú
					break;
			}

		}
		System.out.println("Mensaje de finalización del juego. ");
	}

	private static void mostrarMenu(){
        System.out.println("---- Menú ----\n");
        System.out.println("1.- Buscar pistas. ");
        System.out.println("2.- Recoger objeto encontrado. ");
        System.out.println("3.- Moverse. ");
        System.out.println("4.- Combate. ");
        System.out.println("5.- Extra. ");
        System.out.println("6.- Salir del juego. \n");
        System.out.println("Elige una opción: ");
    }

	private static int opcionUsuario(Scanner scanner) {

		//con esto podemos "trollear" a los que no sepan qué poner
		if (scanner.hasNext("hola")) {
			System.out.println("Hello World!");
		}
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
			//Esto es un ejemplo: Tuto.texto...(); no va ahí
			//Modifica los archivos del package "habitaciones"
				Tuto.textoIntro();
				break;
			case "Sala Secreta":
			//Lo mismo
				Tuto.textoIntroFinal();
				break;
			case "Sala Central":
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
				System.out.println("Has encontrado " + objeto.getNombre() + ". ");
				//Mira esto bien, no debería de recoger aquí
				inventario.recogerObjeto(objeto);
			}
		}
	}

	private static void recogerObjetoEncontrado(Objeto objeto){
		if (objeto.getEncontrado()) {
			inventario.recogerObjeto(objeto);
			System.out.println("Has recogido " + objeto.getNombre() + ". ");
		} else {
			System.out.println("No hay objetos que recoger. ¿Has buscado bien? ");
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
