// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.helpers;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StylePanelActionListener implements ActionListener {

	private Container container;

	public StylePanelActionListener(Container container) {
		this.container = container;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();

		if (command.equals("europeanStyle")) {
			container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		} else if (command.equals("arabStyle")) {
			container.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}

		container.validate();
		container.repaint();
	}

}
