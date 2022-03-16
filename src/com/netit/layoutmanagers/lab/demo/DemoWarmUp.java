// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.lab.helpers.WarmUpClass;

public class DemoWarmUp {
	public static void main(String[] args) {

		WarmUpClass warmUpClass = new WarmUpClass();
		warmUpClass.addComponents(warmUpClass.getContentPane());
		warmUpClass.setTitle("Warm Up Example");
		warmUpClass.setVisible(true);
		warmUpClass.setSize(400, 400);
		warmUpClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
