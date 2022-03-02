// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.intro.helpers;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutClass extends JFrame implements ActionListener {

	private CardLayout cardLayout;
	private Container container;

	public CardLayoutClass() {
		this.cardLayout = new CardLayout();
		this.container = this.getContentPane();
		container.setLayout(cardLayout);

		JButton btn1 = new JButton("First Btn");
		JButton btn2 = new JButton("Second Btn");
		JButton btn3 = new JButton("Third Btn");
		JButton btn4 = new JButton("Last Btn");

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		container.add("Btn1", btn1);
		container.add("Btn2", btn2);
		container.add("Btn3", btn3);
		container.add("Btn4", btn4);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cardLayout.next(container);
	}

}
