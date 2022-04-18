// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.helpers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class NextFirstLastActionListener implements ActionListener {

	private JPanel jPanel;
	private String command;

	public NextFirstLastActionListener(JPanel jPanel, String command) {
		this.jPanel = jPanel;
		this.command = command;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cardLayout = (CardLayout) jPanel.getLayout();
		if (command.equals(NextFirstLastClass.NEXT)) {
			cardLayout.next(jPanel);
		} else if (command.equals(NextFirstLastClass.FIRST)) {
			cardLayout.first(jPanel);
		} else if (command.equals(NextFirstLastClass.LAST)) {
			cardLayout.last(jPanel);
		}
	}

}
