// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.flowlayout.helpers.RadioButtonsClass;

public class DemoRadioButtons {

	public static void main(String[] args) {

		RadioButtonsClass example = new RadioButtonsClass();
		example.setTitle("RadioButtons Example");
		example.addComponents(example.getContentPane());
		example.setSize(500, 200);
		example.setVisible(true);
		example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
