// � 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridlayout.helpers.TextFieldGeneratorClass;

public class DemoTextFieldGenerator {

	public static void main(String[] args) {
		TextFieldGeneratorClass gridLayoutClass = new TextFieldGeneratorClass();
		gridLayoutClass.addComponents(gridLayoutClass.getContentPane());
		gridLayoutClass.setTitle("Text Field Generator Example");
		gridLayoutClass.setSize(400, 400);
		gridLayoutClass.setVisible(true);
		gridLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
