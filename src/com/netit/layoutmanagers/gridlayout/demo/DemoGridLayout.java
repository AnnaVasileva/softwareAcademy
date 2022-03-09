// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridlayout.helpers.GridLayoutClass;

public class DemoGridLayout {
	public static void main(String[] args) {

		GridLayoutClass gridLayoutClass = new GridLayoutClass();
		gridLayoutClass.addComponents(gridLayoutClass.getContentPane());
		gridLayoutClass.setTitle("GridLayout Example");
		gridLayoutClass.setSize(400, 400);
		gridLayoutClass.setVisible(true);
		gridLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
