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
		JPanel cardPanel = new JPanel();
		cardPanel.setBackground(Color.WHITE);
		cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
		cardPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

		cardPanel.setMaximumSize(new Dimension(900, 800));

		cardPanel.add(Header.getComponent());
		cardPanel.add(Register.getComponent());

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
