package hashtables.view;

import javax.swing.*;
import java.io.File;

/**
 * Clase auxiliar para abrir y guardar archivos mediante cuadros de diálogo.
 */
public class FileDialogHelper {

    public static File abrirArchivo(JFrame frame) {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile();
        }
        return null;
    }

    public static void mostrarMensaje(JFrame frame, String mensaje) {
        JOptionPane.showMessageDialog(frame, mensaje);
    }
}
