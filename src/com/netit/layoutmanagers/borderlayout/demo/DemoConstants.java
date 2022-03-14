// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.borderlayout.helpers.ConstantsClass;

public class DemoConstants {
	public static void main(String[] args) {

		ConstantsClass constantsClass = new ConstantsClass();
		constantsClass.addComponents(constantsClass.getContentPane());
		constantsClass.setTitle("Constants Demo");
		constantsClass.setVisible(true);
		constantsClass.setSize(400, 400);
		constantsClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
