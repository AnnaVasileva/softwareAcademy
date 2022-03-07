// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.helpers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class RadioButtonActionListenerClass implements ActionListener {

	private JPanel jPanel;
	private ButtonGroup buttonGroup;

	public RadioButtonActionListenerClass(JPanel jPanel, ButtonGroup buttonGroup) {
		this.jPanel = jPanel;
		this.buttonGroup = buttonGroup;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = buttonGroup.getSelection().getActionCommand();

		if (command.equals("leftOrder")) {
			jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		} else if (command.equals("rightOrder")) {
			jPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		}

		jPanel.validate();
		jPanel.repaint();

	}

}
