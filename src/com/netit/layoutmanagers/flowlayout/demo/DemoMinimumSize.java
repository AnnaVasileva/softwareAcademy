// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.demo;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DemoMinimumSize {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		for (int i = 0; i < 15; i++) {
			jFrame.add(new JButton("Btn " + i));
		}

		FlowLayout flowLayout = new FlowLayout();
		jFrame.setLayout(flowLayout);

		jFrame.setTitle("Minimum Size Method Example");
		jFrame.setVisible(true);
		Dimension dimention = flowLayout.minimumLayoutSize(jFrame);
		jFrame.setSize(dimention);
		System.out.println(dimention);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
