package com.netit.layoutmanagers.intro.helpers;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutClass extends JFrame {

	public GridLayoutClass() {

		for (int i = 0; i < 11; i++) {
			JButton btn = new JButton("Btn " + i);
			this.add(btn);
		}

		GridLayout gridLayout = new GridLayout(5, 2, 5, 5);
		this.setLayout(gridLayout);

	}

}
