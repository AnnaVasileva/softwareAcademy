// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.helpers;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleCardLayoutClass extends JFrame {

	public void addComponent(Container mainContainer) {

		JPanel jPanel = new JPanel();
		CardLayout cardLayout = new CardLayout();
		jPanel.setLayout(cardLayout);

		JButton btn1 = new JButton("Cat");
		btn1.addActionListener(new SimpleCardLayoutActionListener(jPanel));
		JButton btn2 = new JButton("Dog");
		btn2.addActionListener(new SimpleCardLayoutActionListener(jPanel));
		JButton btn3 = new JButton("Fish");
		btn3.addActionListener(new SimpleCardLayoutActionListener(jPanel));

		jPanel.add(btn1);
		jPanel.add(btn2);
		jPanel.add(btn3);

		mainContainer.add(jPanel);
	}

}
