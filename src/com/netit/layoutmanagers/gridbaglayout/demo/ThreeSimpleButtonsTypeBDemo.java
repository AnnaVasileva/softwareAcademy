// � 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridbaglayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridbaglayout.helpers.ThreeSimpleButtonsTypeBClass;

public class ThreeSimpleButtonsTypeBDemo {

	public static void main(String[] args) {
		ThreeSimpleButtonsTypeBClass gridBagLayout = new ThreeSimpleButtonsTypeBClass();
		gridBagLayout.setSize(400, 400);
		gridBagLayout.setVisible(true);
		gridBagLayout.addComponents(gridBagLayout.getContentPane());
		gridBagLayout.setTitle("Simple Buttons TypeB Example");
		gridBagLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}