package implementacion;

/**
 * Clase Paracaidista
 * Representa un soldado de tipo Paracaidista, que tiene un poder de combate
 * mayor al de un soldado regular y la habilidad de saltar desde un avión.
 * Extiende la clase Soldado.
 */
public class Paracaidista extends Soldado {

    /**
     * Constructor de la clase Paracaidista.
     * Inicializa la cantidad de combustible específica para el paracaidista.
     *
     * @param cantidadCombustible Cantidad de combustible inicial (opcional, aunque
     *                            no se usa directamente en sus habilidades).
     */
    public Paracaidista(double cantidadCombustible) {
        // Llamada al constructor de la clase base Soldado
        super(cantidadCombustible);
    }

    /**
     * Obtiene el poder de combate del Paracaidista.
     * El poder de combate de un Paracaidista es fijo: 2.
     *
     * @return Poder de combate del Paracaidista.
     */
    @Override
    public int getPoderCombate() {
        return 2;
    }

    /**
     * Habilidad específica: Saltar.
     * Imprime un mensaje indicando que el paracaidista salta desde un avión.
     */
    public void saltar() {
        System.out.println("Salta desde un avión.");
    }
}
