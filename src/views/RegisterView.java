package views;

import javax.swing.*;
import java.awt.*;

import views.components.Header;
import views.components.Register;

public class RegisterView extends JFrame {
	public RegisterView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Centra la ventana
		setSize(1080, 720);

		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBackground(new Color(240, 244, 248));

		JPanel cardPanel = cardBuilder();
		JPanel wrapper = loadWrapper(cardPanel);

		mainPanel.add(wrapper, BorderLayout.CENTER);

		setContentPane(mainPanel);
		setVisible(true);
	}

	private JPanel cardBuilder() {
		JPanel cardPanel = new JPanel(
			new BorderLayout()
		);

		cardPanel.setBackground(Color.WHITE);
		cardPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

		cardPanel.setMaximumSize(new Dimension(1100, 700));
		cardPanel.setPreferredSize(
			new Dimension(1080, 680)
		);
		cardPanel.setMinimumSize(
			new Dimension(1060, 660)
		);

		cardPanel.add(Header.getComponent(), BorderLayout.NORTH);
		cardPanel.add(Register.getComponent(), BorderLayout.CENTER);

		return cardPanel;
	}

	private JPanel loadWrapper(JPanel children) {
		JPanel centerWrapper = new JPanel();
		centerWrapper.setLayout(new BoxLayout(centerWrapper, BoxLayout.Y_AXIS));
        centerWrapper.setOpaque(false);

		centerWrapper.add(Box.createVerticalGlue());
        centerWrapper.add(children);
        centerWrapper.add(Box.createVerticalGlue());

		return centerWrapper;
	}
}
