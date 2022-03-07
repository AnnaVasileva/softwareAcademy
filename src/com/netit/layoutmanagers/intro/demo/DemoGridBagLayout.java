// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.intro.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.intro.helpers.GridBagLayoutClass;

public class DemoGridBagLayout {

	public static void main(String[] args) {

		GridBagLayoutClass gridBagLayoutClass = new GridBagLayoutClass();
		gridBagLayoutClass.setTitle("GridBagLayout Example");
		gridBagLayoutClass.setSize(400, 400);
		gridBagLayoutClass.setVisible(true);
		gridBagLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
