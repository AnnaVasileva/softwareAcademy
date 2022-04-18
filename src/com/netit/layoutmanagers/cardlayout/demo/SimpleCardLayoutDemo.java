// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.cardlayout.helpers.SimpleCardLayoutClass;

public class SimpleCardLayoutDemo {

	public static void main(String[] args) {

		SimpleCardLayoutClass cardLayout = new SimpleCardLayoutClass();
		cardLayout.addComponent(cardLayout.getContentPane());
		cardLayout.setTitle("Simple Card Example");
		cardLayout.setSize(400, 400);
		cardLayout.setVisible(true);
		cardLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
