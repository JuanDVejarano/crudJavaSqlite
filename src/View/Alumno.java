package src.View;

import javax.swing.*;
import java.awt.*;

public class Alumno {
    private JFrame frame;
    private JPanel formPanel;
    private JPanel buttonPanel;
    private JPanel rightPanel;
    private JTable table;
    private JScrollPane tableScrollPane;

    public Alumno() {
        initializeFrame();
        initializeFormPanel();
        initializeButtonPanel();
        initializeTable();
        addComponentsToFrame();
    }

    private void initializeFrame() {
        frame = new JFrame("Gestión Estudiantes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        frame.setResizable(true);
    }

    private void initializeFormPanel() {
        formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        formPanel.add(new JLabel("Cédula:"));
        JTextField cedulaField = new JTextField();
        formPanel.add(cedulaField);

        formPanel.add(new JLabel("Nombre:"));
        JTextField nombreField = new JTextField();
        formPanel.add(nombreField);

        formPanel.add(new JLabel("Apellidos:"));
        JTextField apellidosField = new JTextField();
        formPanel.add(apellidosField);

        formPanel.add(new JLabel("Celular:"));
        JTextField celularField = new JTextField();
        formPanel.add(celularField);

        formPanel.add(new JLabel("Correo:"));
        JTextField correoField = new JTextField();
        formPanel.add(correoField);

        formPanel.add(new JLabel("Programas:"));
        JComboBox<String> programasDropdown = new JComboBox<>(new String[]{"Programa 1", "Programa 2", "Programa 3"});
        formPanel.add(programasDropdown);
    }

    private void initializeButtonPanel() {
        buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton insertButton = new JButton("Insertar");
        JButton updateButton = new JButton("Actualizar");
        JButton deleteButton = new JButton("Eliminar");

        buttonPanel.add(insertButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        rightPanel = new JPanel(new BorderLayout());
        rightPanel.add(buttonPanel, BorderLayout.NORTH);
    }

    private void initializeTable() {
        table = new JTable(new Object[][]{}, new String[]{"Cédula", "Nombre", "Apellidos", "Celular", "Correo", "Programa"});
        tableScrollPane = new JScrollPane(table);
    }

    private void addComponentsToFrame() {
        frame.add(formPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(tableScrollPane, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Alumno();
    }
}