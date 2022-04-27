// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridbaglayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridbaglayout.helpers.ThreeSimpleButtonsTypeAClass;

public class ThreeSimpleButtonsTypeADemo {

	public static void main(String[] args) {
		ThreeSimpleButtonsTypeAClass gridBagLayout = new ThreeSimpleButtonsTypeAClass();
		gridBagLayout.setSize(400, 400);
		gridBagLayout.setVisible(true);
		gridBagLayout.addComponents(gridBagLayout.getContentPane());
		gridBagLayout.setTitle("Simple Buttons TypeA Example");
		gridBagLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
