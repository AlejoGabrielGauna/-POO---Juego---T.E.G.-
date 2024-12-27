/**
 * 
 */
package implementacion;

/**
 * 
 */
public class Tablero {

	private Ejercito ejercito1;
	private Ejercito ejercito2;
	
	/**
	 * Constructor
	 */
	public Tablero(Ejercito ejercito1, Ejercito ejercito2) {
		// TODO Auto-generated constructor stub
		this.ejercito1 = ejercito1;
		this.ejercito2 = ejercito2;
	}
	
	
	//metodo que debe comparar el poder total de ambos ejercitos
	//Imprimir el resultado de:
		//"El ejectito X gano la batalla con un poder de combate XXX" o "Se produjo un empate"
	public void enfrentar(){
		
		int poderEjercito1 = ejercito1.getPoderTotal();
		int poderEjercito2 = ejercito2.getPoderTotal();
		
        // Comparar los poderes y determinar el resultado
        System.out.println("Enfrentamiento entre los ejércitos:");
        System.out.println("- Ejército 1 (" + ejercito1.getColor() + ") con poder: " + poderEjercito1);
        System.out.println("- Ejército 2 (" + ejercito2.getColor() + ") con poder: " + poderEjercito2);
		
        if (poderEjercito1 > poderEjercito2) {
            System.out.println("El ejército " + ejercito1.getColor() + " ganó la batalla con un poder de combate de " + poderEjercito1 + "-");
            //[PARA MOSTRAR EN UNA NUEVA VENTANA]
            //return "El ejército " + ejercito1.getColor() + " ganó la batalla con un poder de combate de " + poder1 + ".";
        } else if (poderEjercito1 < poderEjercito2) {
            System.out.println("El ejército " + ejercito2.getColor() + " ganó la batalla con un poder de combate de " + poderEjercito2 + ".");
          //[PARA MOSTRAR EN UNA NUEVA VENTANA]
            //return "El ejército " + ejercito2.getColor() + " ganó la batalla con un poder de combate de " + poder2 + ".";
        } else {
            System.out.println("Se produjo un empate. Ambos ejércitos tienen un poder de combate de " + poderEjercito1 + ".");
          //[PARA MOSTRAR EN UNA NUEVA VENTANA]
            //return "Se produjo un empate. Ambos ejércitos tienen un poder de combate de " + poder1 + ".";
        }

	}
}
