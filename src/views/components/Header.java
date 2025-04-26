package views.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header {
    private static JPanel component;
    private static Color backgroundColor = Color.decode("#1d2b3a");

    private Header() {}

    private static void buildComponent() {
        component = new JPanel();
        component.setBackground(backgroundColor);

        component.setLayout(
                new BoxLayout(component, BoxLayout.Y_AXIS));

        JLabel title = labelBuilder(
                "Registro de Estudiantes",
                new Font("Microsoft JhengHei", Font.BOLD, 24));

        JLabel subtitle = labelBuilder(
                "Responde cuidadosamente el siguiente formulario",
                new Font("Microsoft JhengHei", Font.PLAIN, 14));

        component.add(title);
        component.add(subtitle);

        component.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20));

        component.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 100)
        );
    }

    public static JPanel getComponent() {
        if (component == null) {
            buildComponent();
        }

        return component;
    }

    private static JLabel labelBuilder(String label, Font font) {
        JLabel labelRef = new JLabel(label);
        labelRef.setForeground(Color.WHITE);
        labelRef.setFont(font);

        labelRef.setAlignmentX(Component.CENTER_ALIGNMENT);

        return labelRef;
    }
}
