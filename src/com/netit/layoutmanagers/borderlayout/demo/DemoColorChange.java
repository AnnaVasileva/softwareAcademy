// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.borderlayout.helpers.ColorChangeClass;

public class DemoColorChange {
	public static void main(String[] args) {

		ColorChangeClass constantsClass = new ColorChangeClass();
		constantsClass.addComponents(constantsClass.getContentPane());
		constantsClass.setTitle("Color Change Demo");
		constantsClass.setVisible(true);
		constantsClass.setSize(400, 400);
		constantsClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
