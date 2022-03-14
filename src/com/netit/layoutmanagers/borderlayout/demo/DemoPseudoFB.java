// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.borderlayout.helpers.PseudoFbClass;

public class DemoPseudoFB {

	public static void main(String[] args) {

		PseudoFbClass constantsClass = new PseudoFbClass();
		constantsClass.addComponents(constantsClass.getContentPane());
		constantsClass.setTitle("Pseudo Fb Demo");
		constantsClass.setVisible(true);
		constantsClass.setSize(400, 400);
		constantsClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
