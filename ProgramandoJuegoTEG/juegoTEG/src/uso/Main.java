/**
 * Importacion de los paquetes (implementacion / uso)
 */
package uso;

import implementacion.Avion;
import implementacion.Comando;
import implementacion.Ejercito;
import implementacion.Helicoptero;
import implementacion.Tablero;
import implementacion.Tanque;
import implementacion.Soldado;
import implementacion.Paracaidista;

/**
 * Clase MAIN: La clase principal crea instancias de los objetos y ejecuta la lógica del
jueg
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear Ejércitos
	    Ejercito azul = new Ejercito("Azul", new Avion(10.50), new Comando(0), new Tanque(12.00));
	    Ejercito rojo = new Ejercito("Rojo", new Helicoptero(13.45), new Soldado(0), new Paracaidista(0));

	    // Introducción
	    System.out.println("===============================================");
	    System.out.println("¡Bienvenidos al Campo de Batalla de T.E.G.!");
	    System.out.println("Hoy se enfrentarán dos poderosos ejércitos:");
	    System.out.println("- Ejército Azul");
	    System.out.println("- Ejército Rojo");
	    System.out.println("===============================================\n");

	    // Imprimir los detalles de los ejércitos
	    System.out.println("Preparando los ejércitos para la batalla...");
	    System.out.println("Detalles del Ejército Azul:");
	    azul.mostrarEjercito(); // Supongamos que este método imprime los medios y sus poderes

	    System.out.println("\nDetalles del Ejército Rojo:");
	    rojo.mostrarEjercito(); // Supongamos que este método imprime los medios y sus poderes

	    System.out.println("\n===============================================");
	    System.out.println("¡Que comience la batalla!");
	    System.out.println("===============================================\n");

	    // Batalla
	    Tablero tablero = new Tablero(azul, rojo);
	    tablero.enfrentar(); // Determina el ganador o si hay empate

	    // Mostrar detalles adicionales
	    System.out.println("\n===============================================");
	    System.out.println("Detalles adicionales después de la batalla:");
	    System.out.println("===============================================\n");

	    // Comando realiza acciones específicas
	    System.out.println("- El Comando realiza sus habilidades:");
	    Comando comando = new Comando(0);
	    comando.dispararFusil();
	    comando.saltar();
	    comando.emboscar();

	    System.out.println("\n===============================================");
	    System.out.println("- Información de los medios de combate:");
	    Avion avion = new Avion(10.50);
	    System.out.printf("Avión: Combustible restante %.2f unidades.\n", avion.getCantidadCombustible());

	    Tanque tanque = new Tanque(12.00);
	    System.out.printf("Tanque: Combustible restante %.2f unidades.\n", tanque.getCantidadCombustible());

	    System.out.println("\n===============================================");
	    System.out.println("¡Gracias por jugar T.E.G.!");
	    System.out.println("===============================================");

	}

}
