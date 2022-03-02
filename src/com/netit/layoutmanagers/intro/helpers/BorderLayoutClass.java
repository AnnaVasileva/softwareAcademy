// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.intro.helpers;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutClass extends JFrame {

	public BorderLayoutClass() {
		JButton up = new JButton("North");
		JButton down = new JButton("South");
		JButton right = new JButton("East>>>");
		JButton left = new JButton("<<<West");
		JButton center = new JButton("Center");

		BorderLayout borderLayout = new BorderLayout(10, 5);
		this.setLayout(borderLayout);

		this.add(up, BorderLayout.NORTH);
		this.add(down, BorderLayout.SOUTH);
		this.add(right, BorderLayout.EAST);
		this.add(left, BorderLayout.WEST);
		this.add(center, BorderLayout.CENTER);
	}

}
