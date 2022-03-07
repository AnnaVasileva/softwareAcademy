// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.demo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DemoHgapVgap {
	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		jFrame.add(new JButton("Btn 1"));
		jFrame.add(new JButton("Btn 2"));

		FlowLayout flowLayout = new FlowLayout();
		System.out.println("Horizontal gap by default: " + flowLayout.getHgap());
		System.out.println("Vertical gap by default: " + flowLayout.getVgap());
		flowLayout.setHgap(10);
		flowLayout.setVgap(10);
		System.out.println("Horizontal gap: " + flowLayout.getHgap());
		System.out.println("Vertical gap: " + flowLayout.getVgap());

		jFrame.setLayout(flowLayout);
		jFrame.setTitle("Set/Get Gap Example");
		jFrame.setSize(300, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
