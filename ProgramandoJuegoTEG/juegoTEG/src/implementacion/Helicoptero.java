package implementacion;

import interfaz.Medio;

/**
 * Clase Helicoptero
 * Representa un medio de combate aéreo del tipo helicóptero.
 * Extiende la clase MedioCombate e implementa el cálculo de poder de combate
 * específico para los helicópteros.
 */
public class Helicoptero extends MedioCombate {

    /**
     * Constructor de la clase Helicoptero.
     * Inicializa la cantidad de combustible específica del helicóptero.
     *
     * @param cantidadCombustible Cantidad de combustible inicial del helicóptero.
     */
    public Helicoptero(double cantidadCombustible) {
        // Llamada al constructor de la clase base MedioCombate
        super(cantidadCombustible);
    }

    /**
     * Método para obtener el poder de combate del helicóptero.
     * El poder de combate se calcula como: (8 * cantidadCombustible) + 50.
     *
     * @return Poder de combate del helicóptero como un valor entero.
     */
    @Override
    public int getPoderCombate() {
        return (int) (8 * cantidadCombustible + 50);
    }
}
