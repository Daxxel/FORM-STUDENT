package helpers;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class UiHelper {
    public static JLabel labelBuilder(String placeholder) {
        JLabel labelPref = new JLabel(placeholder);
        labelPref.setFont(new Font("Yu Gothic UI Semibold", 1, 14));

        return labelPref;
    }

    public static JButton buttonBuilder(String placeholder) {
        JButton buttonPref = new JButton();

        buttonPref.setBackground(new Color(0, 51, 51));
        buttonPref.setFont(new Font("Yu Gothic UI Semibold", 1, 14));
        buttonPref.setForeground(new Color(255, 255, 255));
        buttonPref.setText(placeholder);
        buttonPref.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        return buttonPref;
    }

    public static JTextField inputBuilder() {
        JTextField inputRef = new JTextField();
        inputRef.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        return inputRef;
    }

    public static JPanel containerBuilder() {
        JPanel containerRef = new JPanel();

        return containerRef;
    }
}
