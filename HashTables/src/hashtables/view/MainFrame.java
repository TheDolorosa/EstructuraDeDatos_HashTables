package hashtables.view;

import javax.swing.*;

/**
 * Interfaz gráfica principal del programa.
 * Permitirá al usuario abrir archivos, insertar, eliminar y buscar registros.
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Hash Tables - Taller Estructura de Datos");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // TODO: agregar botones, paneles y campos más adelante
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
