// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.cardlayout.helpers.ComboBoxClass;

public class ComboBoxDemo {

	public static void main(String[] args) {

		ComboBoxClass cardLayoutClass = new ComboBoxClass();
		cardLayoutClass.addComponents(cardLayoutClass.getContentPane());
		cardLayoutClass.setTitle("Combo Box Example");
		cardLayoutClass.setSize(400, 400);
		cardLayoutClass.setVisible(true);
		cardLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
