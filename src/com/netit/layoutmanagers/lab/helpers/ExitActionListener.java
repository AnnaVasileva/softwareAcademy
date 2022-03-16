// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.helpers;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExitActionListener implements ActionListener {

	private Container mainContainer;

	public ExitActionListener(Container mainContainer) {
		this.mainContainer = mainContainer;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();

		mainContainer.removeAll();
		if (command.equals("exit")) {
			JPanel newContent = new JPanel();
			BoxLayout boxLayout = new BoxLayout(newContent, BoxLayout.Y_AXIS);
			newContent.setLayout(boxLayout);
			JLabel label = new JLabel("Press to enter");
			JButton loginButton = new JButton("Login");
			loginButton.setActionCommand("login");
			loginButton.addActionListener(new ExitActionListener(mainContainer));

			newContent.add(label);
			newContent.add(loginButton);
			mainContainer.add(newContent);
		} else if (command.equals("login")) {
			JiraClass newInstance = new JiraClass();
			newInstance.addComponents(mainContainer);
		}

		mainContainer.validate();
		mainContainer.repaint();

	}

}
