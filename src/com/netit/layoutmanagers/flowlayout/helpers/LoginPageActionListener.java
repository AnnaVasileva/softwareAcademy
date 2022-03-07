// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.helpers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPageActionListener implements ActionListener {

	private JPanel jPanel;

	public LoginPageActionListener(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();

		if (command.equals("clearAction")) {
			JTextField firstNameField = (JTextField) jPanel.getComponent(1);
			firstNameField.setText("");
			JTextField lastNameField = (JTextField) jPanel.getComponent(3);
			lastNameField.setText("");
		} else if (command.equals("okAction")) {
			JTextField firstNameField = (JTextField) jPanel.getComponent(1);
			JTextField lastNameField = (JTextField) jPanel.getComponent(3);

			String labelString = "Hello " + firstNameField.getText() + " " + lastNameField.getText() + "!";
			JLabel helloMsg = new JLabel(labelString);

			jPanel.add(helloMsg);
		}

		jPanel.validate();
		jPanel.repaint();

	}

}
