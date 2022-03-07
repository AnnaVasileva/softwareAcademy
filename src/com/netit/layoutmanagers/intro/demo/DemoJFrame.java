// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.intro.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DemoJFrame {

	public static void main(String[] args) {

		JFrame jFramObj = new JFrame();
		jFramObj.setTitle("JFrame Example");

		JPanel jPanel = new JPanel();
		JLabel label = new JLabel("Click this button");
		JButton button = new JButton();
		button.setText("Button");

		jPanel.add(label);
		jPanel.add(button);

		jFramObj.add(jPanel);
		jFramObj.setSize(300, 300);
		jFramObj.setVisible(true);
		jFramObj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
