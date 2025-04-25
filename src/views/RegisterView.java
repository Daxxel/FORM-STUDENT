package views;

import javax.swing.*;

import controllers.RegisterController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.StudentFactory;

public class RegisterView extends JFrame {
    private static final String[] careers = new String[] {
            "Selecciona una carrera",
            "Ing. Sistemas Computacionales",
            "Ing. Industrial",
            "Ing. Macarrónica",
            "Ing. Empresas"
    };

    private static final String[] semesters = new String[] {
            "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15"
    };

    private RegisterController controller = new RegisterController();

    public RegisterView() {
        setTitle("Registro de estudiantes");
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana
        setBackground(new Color(204, 204, 204));

         // Panel principal con BorderLayout
         JPanel mainPanel = new JPanel(new BorderLayout());
         mainPanel.setBackground(Color.decode("#f5f8fa"));
 
         // Encabezado
         JPanel headerPanel = new JPanel();
         headerPanel.setBackground(Color.decode("#1d2b3a"));
         headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
         headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
 
         JLabel title = new JLabel("Registro de Estudiantes");
         title.setForeground(Color.WHITE);
         title.setFont(new Font("Arial", Font.BOLD, 20));
         title.setAlignmentX(Component.CENTER_ALIGNMENT);
 
         JLabel subtitle = new JLabel("Complete el formulario con los datos del estudiante");
         subtitle.setForeground(Color.WHITE);
         subtitle.setFont(new Font("Arial", Font.PLAIN, 14));
         subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
 
         headerPanel.add(title);
         headerPanel.add(Box.createRigidArea(new Dimension(0, 5)));
         headerPanel.add(subtitle);
 
         // Formulario
         JPanel formPanel = new JPanel(new GridBagLayout());
         formPanel.setBackground(Color.WHITE);
         formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
 
         GridBagConstraints gbc = new GridBagConstraints();
         gbc.insets = new Insets(10, 10, 10, 10);
         gbc.fill = GridBagConstraints.HORIZONTAL;
 
         // Campos
         String[] labels = {"Nombre", "Apellido 1", "Apellido 2 (Opcional)", "Carrera", "Semestre"};
         JComponent[] components = {
                 new JTextField(15),
                 new JTextField(15),
                 new JTextField(15),
                 new JComboBox<>(new String[]{"Seleccionar...", "Ing. Sistemas", "Contaduría", "Derecho"}),
                 new JComboBox<>(new String[]{"Seleccionar...", "1", "2", "3", "4", "5", "6", "7", "8"})
         };
 
         for (int i = 0; i < labels.length; i++) {
             gbc.gridx = i % 3;
             gbc.gridy = i / 3 * 2;
             formPanel.add(new JLabel(labels[i]), gbc);
 
             gbc.gridy++;
             formPanel.add(components[i], gbc);
         }
 
         // Botones
         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
         buttonPanel.setBackground(Color.WHITE);
 
         JButton verListaBtn = new JButton("📋 Ver lista");
         JButton agregarBtn = new JButton("➕ Agregar");
         agregarBtn.setBackground(new Color(0, 168, 107));
         agregarBtn.setForeground(Color.WHITE);
         agregarBtn.setFocusPainted(false);
 
         buttonPanel.add(verListaBtn);
         buttonPanel.add(agregarBtn);
 
         // Añadir al panel principal
         mainPanel.add(headerPanel, BorderLayout.NORTH);
         mainPanel.add(formPanel, BorderLayout.CENTER);
         mainPanel.add(buttonPanel, BorderLayout.SOUTH);
 
         setContentPane(mainPanel);
         setVisible(true);
    }
}
