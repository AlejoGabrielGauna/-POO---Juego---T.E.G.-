/**
 * 
 */
package gui;

//Bibliotecas para la interfaz grafica GUI.
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//Implementacion de las calses del proyecto.
import implementacion.Avion;
import implementacion.Comando;
import implementacion.Ejercito;
import implementacion.Helicoptero;
import implementacion.MedioCombate;
import implementacion.Paracaidista;
import implementacion.Soldado;
import implementacion.Tablero;
import implementacion.Tanque;

/**
 * 
 */
public class MainGui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Crear ventana principal
        JFrame ventana = new JFrame("Campo de Batalla T.E.G.");
        ventana.setSize(600, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(6, 1));

        // Panel para nombres de los ejércitos
        JPanel panelNombres = new JPanel(new GridLayout(2, 2));
        panelNombres.add(new JLabel("Nombre del Ejército Azul:"));
        JTextField nombreAzul = new JTextField();
        panelNombres.add(nombreAzul);
        panelNombres.add(new JLabel("Nombre del Ejército Rojo:"));
        JTextField nombreRojo = new JTextField();
        panelNombres.add(nombreRojo);

        // Panel para seleccionar medios del ejército azul
        JPanel panelAzul = new JPanel(new GridLayout(4, 2));
        panelAzul.add(new JLabel("Medio 1 (Azul):"));
        JComboBox<String> medioAzul1 = new JComboBox<>(new String[]{"Avión", "Helicóptero", "Tanque", "Soldado", "Comando", "Paracaidista"});
        panelAzul.add(medioAzul1);

        panelAzul.add(new JLabel("Medio 2 (Azul):"));
        JComboBox<String> medioAzul2 = new JComboBox<>(new String[]{"Avión", "Helicóptero", "Tanque", "Soldado", "Comando", "Paracaidista"});
        panelAzul.add(medioAzul2);

        panelAzul.add(new JLabel("Medio 3 (Azul):"));
        JComboBox<String> medioAzul3 = new JComboBox<>(new String[]{"Avión", "Helicóptero", "Tanque", "Soldado", "Comando", "Paracaidista"});
        panelAzul.add(medioAzul3);

        // Panel para seleccionar medios del ejército rojo
        JPanel panelRojo = new JPanel(new GridLayout(4, 2));
        panelRojo.add(new JLabel("Medio 1 (Rojo):"));
        JComboBox<String> medioRojo1 = new JComboBox<>(new String[]{"Avión", "Helicóptero", "Tanque", "Soldado", "Comando", "Paracaidista"});
        panelRojo.add(medioRojo1);

        panelRojo.add(new JLabel("Medio 2 (Rojo):"));
        JComboBox<String> medioRojo2 = new JComboBox<>(new String[]{"Avión", "Helicóptero", "Tanque", "Soldado", "Comando", "Paracaidista"});
        panelRojo.add(medioRojo2);

        panelRojo.add(new JLabel("Medio 3 (Rojo):"));
        JComboBox<String> medioRojo3 = new JComboBox<>(new String[]{"Avión", "Helicóptero", "Tanque", "Soldado", "Comando", "Paracaidista"});
        panelRojo.add(medioRojo3);

        // Botón para iniciar la batalla
        JButton botonEnfrentar = new JButton("¡Enfrentar Ejércitos!");

        // Área de texto para mostrar resultados
        JTextArea areaResultados = new JTextArea();
        areaResultados.setEditable(false);

        // Agregar componentes a la ventana
        ventana.add(panelNombres);
        ventana.add(panelAzul);
        ventana.add(panelRojo);
        ventana.add(botonEnfrentar);
        ventana.add(new JScrollPane(areaResultados));

        // Acción del botón "¡Enfrentar Ejércitos!"
        botonEnfrentar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Crear ejércitos a partir de la selección
                    Ejercito azul = new Ejercito(
                            nombreAzul.getText(),
                            crearMedio((String) medioAzul1.getSelectedItem()),
                            crearMedio((String) medioAzul2.getSelectedItem()),
                            crearMedio((String) medioAzul3.getSelectedItem())
                    );

                    Ejercito rojo = new Ejercito(
                            nombreRojo.getText(),
                            crearMedio((String) medioRojo1.getSelectedItem()),
                            crearMedio((String) medioRojo2.getSelectedItem()),
                            crearMedio((String) medioRojo3.getSelectedItem())
                    );

                    // Crear tablero y enfrentar los ejércitos
                    Tablero tablero = new Tablero(azul, rojo);
                    tablero.enfrentar();

                    // Mostrar resultados
                    areaResultados.setText("");
                    areaResultados.append("Ejército Azul:\n");
                    azul.mostrarEjercito();
                    areaResultados.append("\nEjército Rojo:\n");
                    rojo.mostrarEjercito();
                    
 
                } catch (Exception ex) {
                    areaResultados.setText("Error: " + ex.getMessage());
                }
            }
        });

        // Hacer visible la ventana
        ventana.setVisible(true);
    }

    /**
     * Crea un medio de combate basado en el tipo seleccionado.
     *
     * @param tipo El tipo de medio de combate seleccionado.
     * @return Una instancia de MedioCombate correspondiente.
     */
    private static MedioCombate crearMedio(String tipo) {
        switch (tipo) {
            case "Avión":
                return new Avion(10.50);
            case "Helicóptero":
                return new Helicoptero(13.45);
            case "Tanque":
                return new Tanque(12.00);
            case "Soldado":
                return new Soldado(0);
            case "Comando":
                return new Comando(0);
            case "Paracaidista":
                return new Paracaidista(0);
            default:
                throw new IllegalArgumentException("Tipo de medio no reconocido: " + tipo);
        }
    }
    
    
		
}
