// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SetGetGridLayoutClass extends JFrame {

	public void addComponents(Container mainContainer) {
		JPanel jPanel = new JPanel();
		for (int i = 0; i < 20; i++) {
			jPanel.add(new JButton("Btn " + i));
		}

		GridLayout gridLayout = new GridLayout(2, 10);
		gridLayout.setRows(10);
		System.out.println(gridLayout.getColumns());
		gridLayout.setColumns(2);
		System.out.println(gridLayout.getColumns());
		jPanel.setLayout(gridLayout);
		mainContainer.add(jPanel);

	}
}
