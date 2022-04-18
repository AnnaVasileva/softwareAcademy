// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.helpers;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCardLayoutActionListener implements ActionListener {

	private Container jPanel;

	public SimpleCardLayoutActionListener(Container jPanel) {
		this.jPanel = jPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cardLayout = (CardLayout) jPanel.getLayout();
		cardLayout.next(jPanel);

	}

}
