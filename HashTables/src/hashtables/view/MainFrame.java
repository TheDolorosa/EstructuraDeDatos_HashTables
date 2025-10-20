package hashtables.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ventana principal del programa HashTables.
 * Muestra cómo funciona Swing y cómo conectar eventos básicos.
 */
public class MainFrame extends JFrame {

    // Componentes principales
    private JButton btnInsertar;
    private JButton btnBuscar;
    private JButton btnEliminar;
    private JTextField txtBuscar;
    private JTextArea txtResultado;

    public MainFrame() {
        // Configuración general de la ventana
        setTitle("Taller Tablas Hash");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout (organiza los componentes)
        setLayout(new BorderLayout());

        // Panel superior (botones)
        JPanel panelBotones = new JPanel();
        btnInsertar = new JButton("Insertar");
        btnBuscar = new JButton("Buscar");
        btnEliminar = new JButton("Eliminar");
        txtBuscar = new JTextField(10);

        panelBotones.add(new JLabel("ID:"));
        panelBotones.add(txtBuscar);
        panelBotones.add(btnBuscar);
        panelBotones.add(btnInsertar);
        panelBotones.add(btnEliminar);

        add(panelBotones, BorderLayout.NORTH);

        // Área central de texto
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        add(new JScrollPane(txtResultado), BorderLayout.CENTER);

        // Eventos básicos
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.append("Insertar presionado\n");
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = txtBuscar.getText();
                txtResultado.append("Buscando ID: " + id + "\n");
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.append("Eliminar presionado\n");
            }
        });
    }

    // Método main para probar la interfaz
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
