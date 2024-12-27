package implementacion;

import interfaz.Medio;

/**
 * Clase MedioCombate
 * Clase base para todos los vehículos y medios de combate.
 * Implementa la interfaz Medio y proporciona una implementación genérica 
 * de los métodos necesarios, incluyendo el cálculo del poder de combate.
 */
public class MedioCombate implements Medio {

    // Atributo protegido que almacena la cantidad de combustible disponible
    protected double cantidadCombustible;

    /**
     * Constructor de la clase MedioCombate.
     * Inicializa la cantidad de combustible que tendrá el medio de combate.
     *
     * @param cantidadCombustible Cantidad de combustible inicial del medio de combate.
     */
    public MedioCombate(double cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    /**
     * Obtiene la cantidad de combustible del medio de combate.
     *
     * @return Cantidad de combustible como un valor de tipo double.
     */
    public double getCantidadCombustible() {
        return cantidadCombustible;
    }

    /**
     * Calcula el poder de combate del medio.
     * Esta es una implementación genérica que puede ser sobrescrita por las subclases.
     * 
     * El poder de combate se calcula como: cantidadCombustible * 10.
     *
     * @return Poder de combate del medio como un valor entero.
     */
    @Override
    public int getPoderCombate() {
        return (int) (cantidadCombustible * 10);
    }
}

