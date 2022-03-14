// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.borderlayout.helpers.StylePanel;

public class DemoStylePanels {

	public static void main(String[] args) {
		StylePanel constantsClass = new StylePanel();
		constantsClass.addComponents(constantsClass.getContentPane());
		constantsClass.setTitle("Change Style Demo");
		constantsClass.setVisible(true);
		constantsClass.setSize(400, 400);
		constantsClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
