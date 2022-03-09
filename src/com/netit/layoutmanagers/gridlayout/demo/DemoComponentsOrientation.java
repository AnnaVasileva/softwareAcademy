// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridlayout.helpers.ComponentsOrientationClass;

public class DemoComponentsOrientation {

	public static void main(String[] args) {
		ComponentsOrientationClass gridLayoutClass = new ComponentsOrientationClass();
		gridLayoutClass.addComponents(gridLayoutClass.getContentPane());
		gridLayoutClass.setTitle("Components Orientation Example");
		gridLayoutClass.setSize(400, 400);
		gridLayoutClass.setVisible(true);
		gridLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
