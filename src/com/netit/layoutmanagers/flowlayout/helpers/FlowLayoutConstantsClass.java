// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.helpers;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutConstantsClass extends JFrame {

	public void addComponents(Container mainContainer) {
		JPanel leadingPanel = new JPanel();
		for (int i = 0; i < 5; i++) {
			leadingPanel.add(new JButton("Lead " + i));
		}
		leadingPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));

		JPanel leftPanel = new JPanel();
		for (int i = 0; i < 5; i++) {
			leftPanel.add(new JButton("Left " + i));
		}
		leftPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		mainContainer.add(leadingPanel, BorderLayout.NORTH);
		mainContainer.add(leftPanel, BorderLayout.SOUTH);

	}

}
