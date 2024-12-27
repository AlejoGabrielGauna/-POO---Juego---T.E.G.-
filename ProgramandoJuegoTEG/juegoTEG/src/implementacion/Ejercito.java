package implementacion;

/**
 * Clase Ejercito
 * Representa un ejército compuesto por tres medios de combate (vehículos o soldados),
 * con un color identificador y un cálculo de poder total.
 */
public class Ejercito {

    // Atributos de la clase
    private String color; // Color del ejército
    private MedioCombate[] medios; // Arreglo que contiene los tres medios de combate del ejército

    /**
     * Constructor de la clase Ejercito.
     * Inicializa el color del ejército y asigna los tres medios de combate.
     *
     * @param color Color que identifica al ejército (Ejemplo: Azul, Rojo, etc.).
     * @param a     Primer medio de combate.
     * @param b     Segundo medio de combate.
     * @param c     Tercer medio de combate.
     */
    public Ejercito(String color, MedioCombate a, MedioCombate b, MedioCombate c) {
        this.color = color;
        this.medios = new MedioCombate[3];
        this.medios[0] = a;
        this.medios[1] = b;
        this.medios[2] = c;
    }

    /**
     * Método para calcular el poder total del ejército.
     * Suma el poder de combate de los tres medios asignados al ejército.
     *
     * @return Poder total del ejército como un número entero.
     */
    public int getPoderTotal() {
        int totalPoder = 0;

        // Iterar sobre el arreglo de medios de combate y sumar su poder
        for (MedioCombate medio : medios) {
            totalPoder += medio.getPoderCombate();
        }

        return totalPoder;
    }

    /**
     * Método para obtener el color del ejército.
     *
     * @return El color del ejército como una cadena de texto.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para mostrar los detalles del ejército.
     * Incluye el color, los medios de combate, su poder individual y el poder total.
     */
    public void mostrarEjercito() {
        System.out.println("Ejército de Color: " + color);
        System.out.println("Medios de Combate: ");
        
        // Iterar sobre los medios de combate y mostrar su tipo y poder
        for (MedioCombate medio : medios) {
            System.out.println(" - " + medio.getClass().getSimpleName() + " con poder " + medio.getPoderCombate());
        }
        
        // Mostrar el poder total del ejército
        System.out.println("Poder total del Ejército: " + getPoderTotal());
    }
    
}
