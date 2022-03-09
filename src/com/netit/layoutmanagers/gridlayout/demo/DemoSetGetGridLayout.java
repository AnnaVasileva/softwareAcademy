// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridlayout.helpers.SetGetGridLayoutClass;

public class DemoSetGetGridLayout {

	public static void main(String[] args) {
		SetGetGridLayoutClass gridLayoutClass = new SetGetGridLayoutClass();
		gridLayoutClass.addComponents(gridLayoutClass.getContentPane());
		gridLayoutClass.setTitle("Set/Get Example");
		gridLayoutClass.setSize(400, 400);
		gridLayoutClass.setVisible(true);
		gridLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
