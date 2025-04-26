package views;

import javax.swing.*;

import controllers.RegisterController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.StudentFactory;
import views.components.Header;
import views.components.Register;

public class RegisterView extends JFrame {
	public RegisterView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Centra la ventana
		setBackground(new Color(204, 204, 204));
		setSize(1080, 720);

		JPanel mainPane = new JPanel(
				new BorderLayout());

		mainPane.setBorder(BorderFactory.createEmptyBorder(60, 60, 60, 60));

		mainPane.setBackground(
				Color.decode("#f5f8fa"));

		mainPane.add(Header.getComponent(), BorderLayout.NORTH);
		mainPane.add(Register.getComponent(), BorderLayout.CENTER);

		JPanel buttonsPane = new JPanel();

		buttonsPane.setLayout(
				new FlowLayout(FlowLayout.RIGHT));

		buttonsPane.setBackground(Color.WHITE);
		buttonsPane.setBorder(
			BorderFactory.createEmptyBorder(20, 20, 20, 20)
		);

		JButton addStudentButton = new JButton("Agregar");
		JButton watchStudentListButton = new JButton("Ver lista");

		buttonsPane.add(addStudentButton);
		buttonsPane.add(watchStudentListButton);

		mainPane.add(buttonsPane, BorderLayout.SOUTH);

		setContentPane(mainPane);
		setVisible(true);
	}
}
