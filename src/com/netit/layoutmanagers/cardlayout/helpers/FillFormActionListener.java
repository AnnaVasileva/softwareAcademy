// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.helpers;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FillFormActionListener implements ActionListener {

	private Container cardsPanel;
	private String command;

	public FillFormActionListener(Container cardsPanel, String command) {
		this.cardsPanel = cardsPanel;
		this.command = command;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
		if (command.equals(FillFormClass.COMMAND_NEXT)) {
			cardLayout.next(cardsPanel);
		} else if (command.equals(FillFormClass.COMMAND_PREVIOUS)) {
			cardLayout.previous(cardsPanel);
		}
	}

}
