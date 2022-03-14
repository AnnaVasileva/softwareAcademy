// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.helpers;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConstantsClass extends JFrame {

	public void addComponents(Container mainContainer) {
		JPanel jPanel = new JPanel();
		JButton up = new JButton("North");
		JButton down = new JButton("South");
		JButton left = new JButton("West");
		JButton right = new JButton("East");
		JButton center = new JButton("Center");

		jPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		System.out.println(jPanel.getComponentOrientation().isLeftToRight());
		BorderLayout borderLayout = new BorderLayout();
		jPanel.setLayout(borderLayout);
//		jPanel.add(up, BorderLayout.NORTH);
//		jPanel.add(down, BorderLayout.SOUTH);
//		jPanel.add(left, BorderLayout.WEST);
//		jPanel.add(right, BorderLayout.EAST);
//		jPanel.add(center);

		jPanel.add(up, BorderLayout.PAGE_START);
		jPanel.add(down, BorderLayout.PAGE_END);
		jPanel.add(left, BorderLayout.LINE_START);
		jPanel.add(right, BorderLayout.LINE_END);
		jPanel.add(center);

		mainContainer.add(jPanel);

	}

}
