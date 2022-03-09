// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPageGridLayoutClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel usersFieldsPanel = new JPanel();
		JLabel firstNameLabel = new JLabel("First Name: ");
		JTextField firstNameField = new JTextField(2000);
		JLabel lastNameLabel = new JLabel("Last Name: ");
		JTextField lastNameField = new JTextField(200);

		GridLayout gridLayout = new GridLayout(2, 2, 5, 5);
		usersFieldsPanel.setLayout(gridLayout);
		usersFieldsPanel.add(firstNameLabel);
		usersFieldsPanel.add(firstNameField);
		usersFieldsPanel.add(lastNameLabel);
		usersFieldsPanel.add(lastNameField);

		JPanel controlPanel = new JPanel();
		JButton clearButton = new JButton("Clear");
		// TODO
		JButton saveButton = new JButton("Save");
		saveButton.setActionCommand("saveAction");
		saveButton.addActionListener(new LoginPageGridLayoutActionListener(usersFieldsPanel));

		FlowLayout flowLayout = new FlowLayout();
		controlPanel.setLayout(flowLayout);
		controlPanel.add(clearButton);
		controlPanel.add(saveButton);

		BoxLayout boxLayout = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);
		mainContainer.setLayout(boxLayout);
		mainContainer.add(usersFieldsPanel);
		mainContainer.add(controlPanel);

	}

}
