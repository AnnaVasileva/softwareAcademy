// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.lab.helpers.ShopClass;

public class DemoShop {
	public static void main(String[] args) {

		ShopClass shopClass = new ShopClass();
		shopClass.setTitle("Shop Example");
		shopClass.addComponents(shopClass.getContentPane());
		shopClass.setSize(400, 400);
		shopClass.setVisible(true);
		shopClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
