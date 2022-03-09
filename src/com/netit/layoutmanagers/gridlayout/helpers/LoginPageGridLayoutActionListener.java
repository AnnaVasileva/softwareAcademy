// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPageGridLayoutActionListener implements ActionListener {

	private JPanel jPanel;

	public LoginPageGridLayoutActionListener(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();

		if (command.equals("saveAction")) {
			JTextField firstNameFiled = (JTextField) jPanel.getComponent(1);
			firstNameFiled.setEditable(false);
			JTextField lastNameFiled = (JTextField) jPanel.getComponent(3);
			lastNameFiled.setEditable(false);
		}

		jPanel.validate();
		jPanel.repaint();

	}

}
