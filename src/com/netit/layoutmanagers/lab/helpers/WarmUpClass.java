// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.helpers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class WarmUpClass extends JFrame {

	public void addComponents(Container mainContainer) {
		JPanel headerPanel = new JPanel();
		JTextField textField = new JTextField(20);
		JButton someBtn = new JButton("Some Button");

		FlowLayout flowLayout = new FlowLayout();
		headerPanel.setLayout(flowLayout);
		headerPanel.add(textField);
		headerPanel.add(someBtn);

		JPanel contentPanel = new JPanel();
		GridLayout gridLayout = new GridLayout(0, 3);
		contentPanel.setLayout(gridLayout);
		for (int i = 0; i < 10; i++) {
			contentPanel.add(new JButton("Btn " + i));
		}

		JPanel footerPanel = new JPanel();
		JLabel footerLabel = new JLabel("Footer");
		footerPanel.add(footerLabel);
		footerPanel.setBorder(new LineBorder(Color.GRAY));

		BorderLayout borderLayout = new BorderLayout();
		mainContainer.setLayout(borderLayout);
		mainContainer.add(headerPanel, BorderLayout.NORTH);
		mainContainer.add(contentPanel);
		mainContainer.add(footerPanel, BorderLayout.SOUTH);
	}

}
