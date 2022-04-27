// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridbaglayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridbaglayout.helpers.ButtonsFrameClass;

public class ButtonsFrameDemo {

	public static void main(String[] args) {
		ButtonsFrameClass gridBagLayout = new ButtonsFrameClass();
		gridBagLayout.setSize(400, 400);
		gridBagLayout.setVisible(true);
		gridBagLayout.addComponents(gridBagLayout.getContentPane());
		gridBagLayout.setTitle("Weight Button Example");
		gridBagLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
