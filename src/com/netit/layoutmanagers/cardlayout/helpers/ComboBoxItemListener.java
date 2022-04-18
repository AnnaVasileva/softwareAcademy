// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.helpers;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxItemListener implements ItemListener {

	private Container jPanel;

	public ComboBoxItemListener(Container jPanel) {
		this.jPanel = jPanel;
	}

	@Override
	public void itemStateChanged(ItemEvent itemEvent) {
		CardLayout cardLayout = (CardLayout) jPanel.getLayout();
		cardLayout.show(jPanel, (String) itemEvent.getItem());
	}

}
