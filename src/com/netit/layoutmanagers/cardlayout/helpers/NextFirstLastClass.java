// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.helpers;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NextFirstLastClass extends JFrame {

	protected static final String NEXT = "next";
	protected static final String FIRST = "first";
	protected static final String LAST = "last";

	public void addComponents(Container mainContainer) {

		JPanel cardsPanel = new JPanel();
		CardLayout cardLayout = new CardLayout();
		cardsPanel.setLayout(cardLayout);
		for (int i = 0; i < 10; i++) {
			JPanel buttonPanel = new JPanel();
			JButton btn = new JButton("Btn " + i);
			btn.addActionListener(new NextFirstLastActionListener(cardsPanel, NEXT));
			buttonPanel.add(btn);
			cardsPanel.add(buttonPanel);
		}

		JPanel buttonsPanel = new JPanel();
		JButton buttonFirst = new JButton("First");
		buttonFirst.addActionListener(new NextFirstLastActionListener(cardsPanel, FIRST));
		JButton buttonLast = new JButton("Last");
		buttonLast.addActionListener(new NextFirstLastActionListener(cardsPanel, LAST));
		buttonsPanel.add(buttonFirst);
		buttonsPanel.add(buttonLast);

		BoxLayout boxLayout = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);
		mainContainer.setLayout(boxLayout);
		mainContainer.add(cardsPanel);
		mainContainer.add(buttonsPanel);

	}
}
