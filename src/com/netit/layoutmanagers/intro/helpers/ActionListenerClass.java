// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.intro.helpers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class ActionListenerClass implements ActionListener {

	private JDialog jDialog;

	public ActionListenerClass(JDialog jDialog) {
		this.jDialog = jDialog;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jDialog.setVisible(false);
	}

}
