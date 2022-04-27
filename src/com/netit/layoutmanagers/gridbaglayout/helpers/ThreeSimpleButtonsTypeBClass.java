// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridbaglayout.helpers;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreeSimpleButtonsTypeBClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel jPanel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);

		JButton button1 = new JButton("Button 1");
		GridBagConstraints constraintsBtn1 = new GridBagConstraints();
		jPanel.add(button1, constraintsBtn1);

		JButton button2 = new JButton("Button 2");
		GridBagConstraints constraintsBtn2 = new GridBagConstraints();
		constraintsBtn2.gridwidth = GridBagConstraints.REMAINDER;
		jPanel.add(button2, constraintsBtn2);

		JButton button3 = new JButton("Button 3");
		GridBagConstraints constraintsBtn3 = new GridBagConstraints();
		constraintsBtn3.gridwidth = GridBagConstraints.REMAINDER;
		constraintsBtn3.fill = GridBagConstraints.HORIZONTAL;
		jPanel.add(button3, constraintsBtn3);

		mainContainer.add(jPanel);

	}
}
