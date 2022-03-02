package com.netit.layoutmanagers.intro.helpers;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutClass extends JFrame {

	public FlowLayoutClass() {

		for (int i = 0; i < 10; i++) {
			JButton btn = new JButton("Btn " + i);
			this.add(btn);
		}

		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 10, 23);
		this.setLayout(flowLayout);

	}

}
