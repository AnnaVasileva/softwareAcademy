// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.intro.helpers;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class BoxLayoutClass extends Frame {

	private Button[] buttons;

	public BoxLayoutClass() {
		buttons = new Button[5];

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button("Button " + i);
			this.add(buttons[i]);
		}

		BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(boxLayout);

	}

}
