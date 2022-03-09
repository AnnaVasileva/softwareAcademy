// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComponentsOrientationClass extends JFrame {

	public void addComponents(Container mainContainer) {
		JPanel jPanel1 = new JPanel();
		for (int i = 0; i < 9; i++) {
			jPanel1.add(new JButton("LtR " + i));
		}
		GridLayout gridLayout = new GridLayout(3, 3);
		jPanel1.setLayout(gridLayout);

		JPanel jPanel2 = new JPanel();
		for (int i = 0; i < 9; i++) {
			jPanel2.add(new JButton("RtL " + i));
		}
		jPanel2.setLayout(gridLayout);
		jPanel2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		mainContainer.add(jPanel1, BorderLayout.NORTH);
		mainContainer.add(jPanel2, BorderLayout.SOUTH);

	}

}
