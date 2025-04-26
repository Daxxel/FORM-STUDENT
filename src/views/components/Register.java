package views.components;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

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
        component.setBackground(Color.WHITE);

        component.setLayout(
                new GridLayout(2, 2));

        TextInput nameInput = new TextInput(
                "Nombre",
                "El nombre debe tener al menos 2 caracteres");

        TextInput fathersLastName = new TextInput(
                "Apellido paterno",
                "El nombre debe tener al menos 2 caracteres");

        TextInput mothersLastName = new TextInput(
                "Apellido materno (opcional)");

        component.add(nameInput.getComponent());
        component.add(fathersLastName.getComponent());
        component.add(mothersLastName.getComponent());
    }

    public static JPanel getComponent() {
        if (component == null) {
            buildComponent();
        }

        return component;
    }

    private static JPanel inputFactory(String name, String placeholder, String invalidMessage) {
        JPanel container = new JPanel();

        container.setLayout(
                new BoxLayout(container, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(name);
        JLabel errorLabel = new JLabel(invalidMessage);

        JTextField input = new JTextField(placeholder);

        container.add(label);
        container.add(input);
        container.add(errorLabel);

        return container;
    }

    private static JPanel inputFactory(String name, String placeholder) {
        JPanel container = new JPanel();

        container.setLayout(
                new BoxLayout(container, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(name);

        JTextField input = new JTextField(placeholder);

        container.add(label);
        container.add(input);

        return container;
    }
}
