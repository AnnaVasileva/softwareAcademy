package com.netit.layoutmanagers.intro.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.intro.helpers.CardLayoutClass;

public class DemoCardLayout {

	public static void main(String[] args) {

		CardLayoutClass cardLayoutClass = new CardLayoutClass();
		cardLayoutClass.setTitle("CardLayout Example");
		cardLayoutClass.setSize(400, 400);
		cardLayoutClass.setVisible(true);
		cardLayoutClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
