// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.demo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DemoSetGet {
	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		jFrame.add(new JButton("Btn 1"));
		jFrame.add(new JButton("Btn 2"));

		FlowLayout flowLayout = new FlowLayout();
		System.out.println(flowLayout.getAlignment());
		flowLayout.setAlignment(FlowLayout.RIGHT);
		System.out.println(flowLayout.getAlignment());

		jFrame.setLayout(flowLayout);
		jFrame.setTitle("Set/Get Alignment Example");
		jFrame.setSize(300, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
