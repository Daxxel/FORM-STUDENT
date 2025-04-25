package views;

import javax.swing.*;

import controllers.RegisterController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import helpers.UiHelper;
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

        JLabel nameLabel = UiHelper.labelBuilder("Nombre");
        JLabel fatherLastNameLabel = UiHelper.labelBuilder("Apellido paterno");
        JLabel motherLastNameLabel = UiHelper.labelBuilder("Apellido materno");
        JLabel semesterLabel = UiHelper.labelBuilder("Semestre");
        JLabel careerNameLabel = UiHelper.labelBuilder("Carrera");
        JLabel titleLabel = UiHelper.labelBuilder("Registro de Estudiantes");
        JLabel subtitleLabel = UiHelper.labelBuilder("Complete el formulario con los datos del estudiante");

        JButton addButton = UiHelper.buttonBuilder("Agregar");
        JButton watchListButton = UiHelper.buttonBuilder("Ver Lista");

        JTextField nameInput = UiHelper.inputBuilder();
        JTextField fatherLastNameInput = UiHelper.inputBuilder();
        JTextField motherLastNameInput = UiHelper.inputBuilder();

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });

        watchListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            }
        });

        // Organización en la vista
        JPanel headerContainer = UiHelper.containerBuilder();



        JPanel mainContainer = UiHelper.containerBuilder();
    }
}
