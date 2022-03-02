package com.netit.layoutmanagers.intro.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.intro.helpers.FlowLayoutClass;

public class DemoFlowLayout {
	public static void main(String[] args) {

		FlowLayoutClass flowLayoutClass = new FlowLayoutClass();
		flowLayoutClass.setTitle("FlowLayout Example");
		flowLayoutClass.setSize(400, 400);
		flowLayoutClass.setVisible(true);
		flowLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
