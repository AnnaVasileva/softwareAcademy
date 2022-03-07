// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.flowlayout.helpers.ThreeButtonsClass;

public class DemoThreeButtons {

	public static void main(String[] args) {

		ThreeButtonsClass threeButtonsClass = new ThreeButtonsClass();
		threeButtonsClass.addComponents(threeButtonsClass.getContentPane());
		threeButtonsClass.setTitle("Three Buttons Example");
		threeButtonsClass.setSize(300, 200);
		threeButtonsClass.setVisible(true);
		threeButtonsClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
