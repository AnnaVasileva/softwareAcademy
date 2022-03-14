// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.helpers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ColorChangeActionListener implements ActionListener {

	private JPanel jPanel;

	public ColorChangeActionListener(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();

		if (command.equals("yellow")) {
			jPanel.setBackground(new Color(255, 222, 111));
		} else if (command.equals("orange")) {
			jPanel.setBackground(new Color(255, 203, 151));
		} else if (command.equals("reset")) {
			jPanel.setBackground(Color.WHITE);
		}

		jPanel.validate();
		jPanel.repaint();
	}

}
