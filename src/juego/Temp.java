package juego;

public class Temp {

public static void Temporizador (int x) {

    try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


//Método para limpiar la pantalla
public static void LimpiarPantalla() {
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
           
        }  
    }
}