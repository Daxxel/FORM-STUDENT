package views.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextInput {
    private JPanel container;
    private JTextField input;
    private JLabel errorLabel;
    private JLabel label;
    private int minCharacters = 2;

    public JPanel getComponent() {
        return container;
    }

    public JTextField getInput() {
        return input;
    }

    public TextInput(String name, String invalidMessage) {
        buildCommon();

        errorLabel = new JLabel(invalidMessage);
        errorLabel.setVisible(false);

        label = new JLabel(name);
        label.setFont(
            new Font("Yu Gothic UI Semibold", Font.BOLD, 14)
        );

        input = new JTextField();

        input.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 50)
        );

        container.add(label);
        container.add(input);
        container.add(errorLabel);
    }

    public TextInput(String name) {
        buildCommon();

        label = new JLabel(name);
        label.setFont(
            new Font("Yu Gothic UI Semibold", Font.BOLD, 14)
        );
        
        input = new JTextField();

        input.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 50)
        );

        container.add(label);
        container.add(input);
    }

    public void buildCommon() {
        container = new JPanel();
        container.setOpaque(false);

        container.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 50)
        );

        container.setLayout(
            new BoxLayout(container, BoxLayout.Y_AXIS));
    }

    public boolean isValid() {
        String inputValue = input.getText();
        boolean hasMinChars = inputValue.length() > minCharacters;
        return inputValue.isBlank() || inputValue.isEmpty() || hasMinChars;
    }

    public void changeLabelColor(Color color) {
        label.setForeground(color);
        label.repaint();
    }

    public void toggleInvalidMessage() {
        boolean isVisible = errorLabel.isVisible();
        errorLabel.setVisible(!isVisible);
        
        errorLabel.repaint();
    }

    public void toggleInvalidMessage(String message) {
        boolean isVisible = errorLabel.isVisible();
        errorLabel.setVisible(!isVisible);
        errorLabel.setText(message);

        errorLabel.repaint();
    }
}
