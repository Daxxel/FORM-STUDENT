package views.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register {
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

    private static JPanel component;

    private static void buildComponent() {
        component = new JPanel();
        component.setOpaque(false);

        TextInput nameField = new TextInput("Nombre", "Chipa se la come");
        TextInput fatherField = new TextInput("Apellido", "Chipa se la come");

        JPanel firstPanel = new JPanel();
        firstPanel.setOpaque(false);

        firstPanel.setLayout(
            new BoxLayout(firstPanel, BoxLayout.X_AXIS)
        );

        firstPanel.add(nameField.getComponent());
        firstPanel.add(Box.createHorizontalStrut(20));
        firstPanel.add(fatherField.getComponent());

        firstPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));

        component.add(firstPanel);
    }

    public static JPanel getComponent() {
        if (component == null) {
            buildComponent();
        }

        return component;
    }
}
