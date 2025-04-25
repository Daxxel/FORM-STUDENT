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

        UiHelper helper = new UiHelper();

        JLabel nameLabel = helper.labelBuilder("Nombre");
        JLabel fatherLastNameLabel = helper.labelBuilder("Apellido paterno");
        JLabel motherLastNameLabel = helper.labelBuilder("Apellido materno");
        JLabel semesterLabel = helper.labelBuilder("Semestre");
        JLabel careerNameLabel = helper.labelBuilder("Carrera");

        JButton addButton = helper.buttonBuilder("Agregar");
        JButton watchListButton = helper.buttonBuilder("Ver Lista");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String name = nameLabel.getText();
                String fatherLastName = fatherLastNameLabel.getText();
                String motherLastName = motherLastNameLabel.getText();

                String fullName = name + " " + fatherLastName + " " + motherLastName;
                
                String semester = semesterLabel.getText();
                String career = careerNameLabel.getText();

                controller.registerStudent(fullName, career, semester);
                dispose();
            }
        });

        watchListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.toggleStudents();
                dispose();
            }
        });

        Panel mainPanel = new Panel();
        mainPanel.setBackground(new Color(255, 255, 255));
    }
}
