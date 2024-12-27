/**
 * 
 */
package implementacion;

/**
 * 
 */
public class Soldado extends MedioCombate {

	
	/**
	 *No se especifivan atributos por lo tanto el constructor es opccional.
	 */
	public Soldado(double cantidadCombustible){
		// TODO Auto-generated constructor stub
		super(cantidadCombustible);
	}

	
	
	//metodos de los soldados:
	public int getPoderCombate() {
		return 1;
	}
	
	public void dispararFusil() {
		System.out.println("Dispara fusil");
	}
}
