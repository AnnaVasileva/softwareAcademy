// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.helpers;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonsClass extends JFrame {

	public void addComponents(Container mainContainer) {
		JPanel randomButtonsPanel = new JPanel();
		for (int i = 0; i < 5; i++) {
			randomButtonsPanel.add(new JButton("Btn " + i));
		}

		JPanel controlPanel = new JPanel();
		JRadioButton leftRadioButton = new JRadioButton("Left Button");
		leftRadioButton.setActionCommand("leftOrder");
		JRadioButton rightRadioButton = new JRadioButton("Right Button");
		rightRadioButton.setActionCommand("rightOrder");
		rightRadioButton.setSelected(true);
		controlPanel.add(leftRadioButton);
		controlPanel.add(rightRadioButton);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(leftRadioButton);
		buttonGroup.add(rightRadioButton);

		JButton applyButton = new JButton("Apply");
		applyButton.addActionListener(new RadioButtonActionListenerClass(randomButtonsPanel, buttonGroup));
		controlPanel.add(applyButton);

		mainContainer.add(randomButtonsPanel, BorderLayout.NORTH);
		mainContainer.add(controlPanel, BorderLayout.SOUTH);
	}

}
