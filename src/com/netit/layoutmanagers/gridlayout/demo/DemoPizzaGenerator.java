// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridlayout.helpers.PizzaGeneratorClass;

public class DemoPizzaGenerator {

	public static void main(String[] args) {
		PizzaGeneratorClass gridLayoutClass = new PizzaGeneratorClass();
		gridLayoutClass.addComponents(gridLayoutClass.getContentPane());
		gridLayoutClass.setTitle("Pizza Generator Example");
		gridLayoutClass.setSize(400, 400);
		gridLayoutClass.setVisible(true);
		gridLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
