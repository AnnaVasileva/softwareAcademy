// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.lab.helpers.JiraClass;

public class DemoJira {
	public static void main(String[] args) {

		JiraClass shopClass = new JiraClass();
		shopClass.setTitle("Jira Example");
		shopClass.addComponents(shopClass.getContentPane());
		shopClass.setSize(400, 400);
		shopClass.setVisible(true);
		shopClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
