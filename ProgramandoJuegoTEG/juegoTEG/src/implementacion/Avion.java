package implementacion;

import interfaz.Medio;

/**
 * Clase Avion
 * Extiende la clase MedioCombate y representa un medio de combate aéreo.
 * Calcula el poder de combate específico de un avión según su combustible disponible.
 */
public class Avion extends MedioCombate {

    /**
     * Constructor de la clase Avion.
     * Inicializa la cantidad de combustible específica del avión.
     *
     * @param cantidadCombustible Cantidad de combustible inicial del avión.
     */
    public Avion(double cantidadCombustible) {
        // Llamada al constructor de la clase base MedioCombate
        super(cantidadCombustible);
    }

    /**
     * Método para obtener el poder de combate del avión.
     * El poder de combate se calcula como: (10 * cantidadCombustible) + 100.
     *
     * @return Poder de combate del avión como un valor entero.
     */
    @Override
    public int getPoderCombate() {
        return (int) (10 * cantidadCombustible + 100);
    }
}

