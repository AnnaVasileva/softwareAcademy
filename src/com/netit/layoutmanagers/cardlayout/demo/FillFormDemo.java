// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.cardlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.cardlayout.helpers.FillFormClass;

public class FillFormDemo {

	public static void main(String[] args) {

		FillFormClass cardLayoutClass = new FillFormClass();
		cardLayoutClass.addComponents(cardLayoutClass.getContentPane());
		cardLayoutClass.setTitle("Fill Forms Example");
		cardLayoutClass.setSize(400, 400);
		cardLayoutClass.setVisible(true);
		cardLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
