// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.helpers;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FillFormClass extends JFrame {
	public static final String COMMAND_NEXT = "next";
	public static final String COMMAND_PREVIOUS = "previous";

	public void addComponents(Container mainContainer) {

		JPanel cardsPanel = new JPanel();
		CardLayout cardLayout = new CardLayout();
		cardsPanel.setLayout(cardLayout);

		JPanel namePanelCard = new JPanel();
		JLabel nameLabel = new JLabel("Name: ");
		JTextField nameField = new JTextField(20);
		namePanelCard.add(nameLabel);
		namePanelCard.add(nameField);
		cardsPanel.add(namePanelCard);

		JPanel emailPanelCard = new JPanel();
		JLabel emailLabel = new JLabel("Email: ");
		JTextField emailField = new JTextField(20);
		emailPanelCard.add(emailLabel);
		emailPanelCard.add(emailField);
		cardsPanel.add(emailPanelCard);

		JPanel professionPanelCard = new JPanel();
		JLabel professionLabel = new JLabel("Profession: ");
		JTextField professionField = new JTextField(20);
		professionPanelCard.add(professionLabel);
		professionPanelCard.add(professionField);
		cardsPanel.add(professionPanelCard);

		JPanel buttonsPanel = new JPanel();
		JButton buttonNext = new JButton("Next >");
		buttonNext.addActionListener(new FillFormActionListener(cardsPanel, COMMAND_NEXT));
		JButton buttonPrevious = new JButton("< Previous");
		buttonPrevious.addActionListener(new FillFormActionListener(cardsPanel, COMMAND_PREVIOUS));
		buttonsPanel.add(buttonPrevious);
		buttonsPanel.add(buttonNext);

		JPanel contentPanel = new JPanel();
		BoxLayout boxLayout = new BoxLayout(contentPanel, BoxLayout.Y_AXIS);
		contentPanel.setLayout(boxLayout);
		contentPanel.add(cardsPanel);
		contentPanel.add(buttonsPanel);

		mainContainer.add(contentPanel);

	}
}
