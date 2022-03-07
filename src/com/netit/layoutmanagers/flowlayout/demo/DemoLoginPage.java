// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.flowlayout.helpers.LoginPageClass;

public class DemoLoginPage {

	public static void main(String[] args) {

		LoginPageClass loginPageClass = new LoginPageClass();
		loginPageClass.setTitle("Login Page Example");
		loginPageClass.addComponents(loginPageClass.getContentPane());
		loginPageClass.setSize(300, 200);
		loginPageClass.setVisible(true);
		loginPageClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
