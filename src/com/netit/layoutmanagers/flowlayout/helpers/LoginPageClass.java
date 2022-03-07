// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.helpers;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPageClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel userFiledsPanel = new JPanel();
		JLabel firstNameLabel = new JLabel("First Name: ");
		JTextField firstName = new JTextField(20);
		JLabel lastNameLabel = new JLabel("Last Name: ");
		JTextField lastName = new JTextField(20);

		FlowLayout fieldsFlowLayout = new FlowLayout(FlowLayout.LEFT);
		userFiledsPanel.setLayout(fieldsFlowLayout);
		userFiledsPanel.add(firstNameLabel);
		userFiledsPanel.add(firstName);
		userFiledsPanel.add(lastNameLabel);
		userFiledsPanel.add(lastName);

		JPanel controlsPanel = new JPanel();
		JButton clearButton = new JButton("Clear");
		clearButton.setActionCommand("clearAction");
		clearButton.addActionListener(new LoginPageActionListener(userFiledsPanel));

		JButton okButton = new JButton("OK");
		okButton.setActionCommand("okAction");
		okButton.addActionListener(new LoginPageActionListener(userFiledsPanel));

		FlowLayout controlsFlowLayout = new FlowLayout();
		controlsPanel.setLayout(controlsFlowLayout);
		controlsPanel.add(clearButton);
		controlsPanel.add(okButton);

		BoxLayout boxLayout = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);
		mainContainer.setLayout(boxLayout);
		mainContainer.add(userFiledsPanel);
		mainContainer.add(controlsPanel);

	}

}
