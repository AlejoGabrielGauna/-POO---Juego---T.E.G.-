/**
 * 
 */
package implementacion;
import interfaz.Medio;

/**
 * Hereda los metodos de MedioCombate
 */
public class Tanque extends MedioCombate {
	
	/**
	 * Construictor
	 */
	public Tanque(double cantidadCombustible) {
		// TODO Auto-generated constructor stub
		super(cantidadCombustible);
	}

	
	/*Metodos*/
	public int getPoderCombate() {
		return (int) (cantidadCombustible *  4);
	}
}
