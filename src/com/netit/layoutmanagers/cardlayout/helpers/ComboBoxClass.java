// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.helpers;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComboBoxClass extends JFrame {
	private static final String SHOW_JTEXTFIELD = "Show JTextField";
	private static final String SHOW_JBUTTONS = "Show JButtons";

	public void addComponents(Container mainContainer) {
		JPanel comboBoxPanel = new JPanel();
		String[] comBoxValues = { SHOW_JBUTTONS, SHOW_JTEXTFIELD };
		JComboBox<String> comboBox = new JComboBox<>(comBoxValues);
		comboBoxPanel.add(comboBox);

		JPanel cardPanel = new JPanel();
		CardLayout cardLayout = new CardLayout();
		cardPanel.setLayout(cardLayout);

		// Create buttonPanelCard
		JPanel buttonsCard = new JPanel();
		buttonsCard.add(new JButton("Button 1"));
		buttonsCard.add(new JButton("Button 2"));
		buttonsCard.add(new JButton("Button 3"));
		cardPanel.add(buttonsCard, SHOW_JBUTTONS);

		// Create textFieldPanelCard
		JPanel textFieldCard = new JPanel();
		textFieldCard.add(new JTextField("TextField", 20));
		cardPanel.add(textFieldCard, SHOW_JTEXTFIELD);

		comboBox.addItemListener(new ComboBoxItemListener(cardPanel));

		JPanel contentPanel = new JPanel();
		BoxLayout boxLayout = new BoxLayout(contentPanel, BoxLayout.Y_AXIS);
		contentPanel.setLayout(boxLayout);
		contentPanel.add(comboBoxPanel);
		contentPanel.add(cardPanel);

		mainContainer.add(contentPanel);

	}

}
