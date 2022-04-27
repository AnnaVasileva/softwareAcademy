// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridbaglayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.gridbaglayout.helpers.AnchorButtonClass;

public class AnchorButtonDemo {

	public static void main(String[] args) {
		AnchorButtonClass gridBagLayout = new AnchorButtonClass();
		gridBagLayout.setSize(400, 400);
		gridBagLayout.setVisible(true);
		gridBagLayout.addComponents(gridBagLayout.getContentPane());
		gridBagLayout.setTitle("Anchor Button Example");
		gridBagLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}