// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutClass extends JFrame {

	public void addComponents(Container mainContainer) {
		JPanel jPanel = new JPanel();
		for (int i = 0; i < 21; i++) {
			jPanel.add(new JButton("Btn " + i));
		}

		GridLayout gridLayout = new GridLayout(0, 5);
		jPanel.setLayout(gridLayout);
		mainContainer.add(jPanel);

	}

}
