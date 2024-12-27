/**
 * 
 */
package interfaz;

/**
 * Interfaz de Medio
 */
public interface Medio {
	
	public static final int poderCombate = 0;
	
	/*Metodo*/
	public default int getPoderCombate() {
		return poderCombate;
	}
	
	
}
