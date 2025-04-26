package views.components;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextInput {
    private JPanel container;

    public JPanel getComponent() {
        return container;
    }

    public TextInput(String name, String invalidMessage) {
        container = new JPanel();

        container.setLayout(
                new BoxLayout(container, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(name);
        JLabel errorLabel = new JLabel(invalidMessage);

        JTextField input = new JTextField();

        container.add(label);
        container.add(input);
        container.add(errorLabel);
    }

    public TextInput(String name) {
        container = new JPanel();

        container.setLayout(
                new BoxLayout(container, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(name);

        JTextField input = new JTextField();

        container.add(label);
        container.add(input);
    }
}
