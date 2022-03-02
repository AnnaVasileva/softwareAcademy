package com.netit.layoutmanagers.intro.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.netit.layoutmanagers.intro.helpers.ActionListenerClass;

public class DemoJDialog {
	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		JDialog jDialog = new JDialog(jFrame, "JDialog Example", true);

		jDialog.setLayout(new FlowLayout());
		JButton btn = new JButton("OK");
		ActionListener actionListener = new ActionListenerClass(jDialog);
		btn.addActionListener(actionListener);

		JLabel label = new JLabel("Click the button");

		jDialog.add(label);
		jDialog.add(btn);
		jDialog.setSize(300, 300);
		jDialog.setVisible(true);

	}
}
