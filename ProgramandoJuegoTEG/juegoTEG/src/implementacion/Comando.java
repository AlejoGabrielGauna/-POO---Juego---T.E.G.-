package implementacion;

/**
 * Clase Comando
 * Representa un soldado de clase "Comando", que tiene el mayor poder de combate 
 * entre los tipos de soldados y habilidades adicionales.
 * Extiende la clase MedioCombate.
 */
public class Comando extends MedioCombate {

    /**
     * Constructor de la clase Comando.
     * Inicializa la cantidad de combustible del Comando.
     *
     * @param cantidadCombustible Cantidad de combustible inicial (opcional, aunque 
     *                            no se usa directamente en las habilidades).
     */
    public Comando(double cantidadCombustible) {
        // Llamada al constructor de la clase base MedioCombate
        super(cantidadCombustible);
    }

    /**
     * Obtiene el poder de combate del Comando.
     * El poder de combate de un Comando es siempre fijo: 3.
     *
     * @return Poder de combate del Comando.
     */
    @Override
    public int getPoderCombate() {
        return 3;
    }

    /**
     * Habilidad específica: Emboscar.
     * Imprime un mensaje indicando que el Comando realiza una emboscada.
     */
    public void emboscar() {
        System.out.println("Hace una emboscada.");
    }

    /**
     * Habilidad específica: Disparar con fusil.
     * Imprime un mensaje indicando que el Comando dispara con su fusil.
     */
    public void dispararFusil() {
        System.out.println("Dispara fusil.");
    }

    /**
     * Habilidad específica: Saltar de un avión.
     * Imprime un mensaje indicando que el Comando salta de un avión.
     */
    public void saltar() {
        System.out.println("Salta de un avión.");
    }
}
