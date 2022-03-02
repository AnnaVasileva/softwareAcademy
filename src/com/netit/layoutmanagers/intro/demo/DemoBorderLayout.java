package com.netit.layoutmanagers.intro.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.intro.helpers.BorderLayoutClass;

public class DemoBorderLayout {

	public static void main(String[] args) {

		BorderLayoutClass borderLayoutClass = new BorderLayoutClass();
		borderLayoutClass.setTitle("BorderLayout Example");
		borderLayoutClass.setSize(400, 400);
		borderLayoutClass.setVisible(true);
		borderLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
