// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.helpers;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeaderActionLister implements ActionListener {

	private Container mainContainer;

	public HeaderActionLister(Container mainContainer) {
		this.mainContainer = mainContainer;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();

		Component[] components = mainContainer.getComponents();
		BorderLayout containerLayout = (BorderLayout) mainContainer.getLayout();
		JPanel headerPanel = null;

		for (Component component : components) {
			if (containerLayout.getConstraints(component).equals(BorderLayout.NORTH)) {
				headerPanel = (JPanel) component;
			} else if (containerLayout.getConstraints(component).equals(BorderLayout.CENTER)) {
				mainContainer.remove(component);
			}

		}

		if (Objects.nonNull(headerPanel)) {

			JPanel newContentPanel = new JPanel();
			JButton homeButton = (JButton) headerPanel.getComponent(0);
			JButton profileButton = (JButton) headerPanel.getComponent(1);
			if (command.equals("home")) {
				homeButton.setEnabled(false);
				profileButton.setEnabled(true);
				JLabel contentLabel = new JLabel("Welcome to our shop!");
				newContentPanel.add(contentLabel);
			} else if (command.equals("profile")) {
				homeButton.setEnabled(true);
				profileButton.setEnabled(false);
				JLabel contentLabel = new JLabel("My Profile");
				newContentPanel.add(contentLabel);
			}

			mainContainer.add(newContentPanel);
			mainContainer.validate();
			mainContainer.repaint();
		}

	}

}
