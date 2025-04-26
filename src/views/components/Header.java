package views.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header {
    private static JPanel component;
    private static Color backgroundColor = Color.decode("#1d2b3a");

    private static void buildComponent() {
        component = new JPanel();
        component.setBackground(backgroundColor);

        component.setLayout(
                new BoxLayout(component, BoxLayout.Y_AXIS));

        JLabel title = titleBuilder();
        JLabel subtitle = subtitleBuilder();

        component.add(title);
        component.add(subtitle);

        component.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20));

        component.add(
                Box.createRigidArea(new Dimension(0, 5)));
    }

    public static JPanel getComponent() {
        if (component == null) {
            buildComponent();
        }

        return component;
    }

    private static JLabel titleBuilder() {
        JLabel title = new JLabel("Registro de Estudiantes");
        title.setForeground(Color.WHITE);
        title.setFont(
                new Font("Microsoft JhengHei", Font.BOLD, 24));

        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        return title;
    }

    private static JLabel subtitleBuilder() {
        JLabel subtitle = new JLabel("Responde cuidadosamente el siguiente formulario");
        subtitle.setForeground(Color.WHITE);
        subtitle.setFont(
                new Font("Microsoft JhengHei", Font.PLAIN, 14));

        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        return subtitle;
    }
}
