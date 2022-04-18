// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.cardlayout.helpers.NextFirstLastClass;

public class NextFirstLastDemo {

	public static void main(String[] args) {

		NextFirstLastClass cardLayoutClass = new NextFirstLastClass();
		cardLayoutClass.addComponents(cardLayoutClass.getContentPane());
		cardLayoutClass.setTitle("Next/First/Last Example");
		cardLayoutClass.setSize(400, 400);
		cardLayoutClass.setVisible(true);
		cardLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
