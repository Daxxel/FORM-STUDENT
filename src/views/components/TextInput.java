package views.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
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
    private String errorMessage;
    private boolean required = false;

    public JPanel getComponent() {
        return container;
    }

    public JTextField getInput() {
        return input;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String message) {
        errorMessage = message;
    }

    public TextInput(String name, boolean required) {
        label = new JLabel(name);
        label.setFont(
            new Font("Comic sans", Font.BOLD, 12)
        );
        this.required = required;
        
        input = new JTextField();
        input.setAlignmentX(Component.LEFT_ALIGNMENT);

        container = new JPanel();
        container.setOpaque(false);

        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(label);
        container.add(input);

        if (this.required) {
            errorMessage = "Invalid";
            errorLabel = new JLabel(errorMessage);
            container.add(errorLabel);
        }
    }

    public void buildCommon() {
        container = new JPanel();
        container.setOpaque(false);
        container.setAlignmentX(JPanel.LEFT_ALIGNMENT);

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
