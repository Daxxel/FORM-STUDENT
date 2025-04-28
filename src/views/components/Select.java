package views.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Select {
    private JPanel component;
    private JComboBox<String> select;

    public JPanel getComponent() {
        return component;
    }

    public JComboBox<String> getSelect() {
        return select;
    }

    public Select(String labelText, String[] options) {
        component = new JPanel();
        component.setOpaque(false);
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(labelText);

        label.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
        select = new JComboBox<>(options);

        select.setAlignmentX(JComboBox.LEFT_ALIGNMENT); // o CENTER_ALIGNMENT si prefieres

        select.setForeground(new Color(33, 37, 41));
        select.setFont(new Font("SansSerif", Font.PLAIN, 14));

        component.add(label);
        component.add(select);
    }
}
