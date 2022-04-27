// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridbaglayout.helpers;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnchorButtonClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel jPanel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);

		JButton btn1 = new JButton("Button 1");
		jPanel.add(btn1);
		JButton btn2 = new JButton("Button 2");
		jPanel.add(btn2);
		JButton btn3 = new JButton("Button 3");
		jPanel.add(btn3);
		JButton btn4 = new JButton("Button 4");
		GridBagConstraints constraintsBtn4 = new GridBagConstraints();
		constraintsBtn4.gridwidth = GridBagConstraints.REMAINDER;
		jPanel.add(btn4, constraintsBtn4);

		JButton btn5 = new JButton("Button 5");
		GridBagConstraints constraintsBtn5 = new GridBagConstraints();
		constraintsBtn5.gridwidth = 3;
		constraintsBtn5.gridheight = GridBagConstraints.REMAINDER;
		constraintsBtn5.anchor = GridBagConstraints.SOUTHWEST;
		jPanel.add(btn5, constraintsBtn5);

		JButton btn6 = new JButton("Button 6");
		GridBagConstraints constraintsBtn6 = new GridBagConstraints();
		constraintsBtn6.gridwidth = GridBagConstraints.REMAINDER;
		jPanel.add(btn6, constraintsBtn6);

		JButton btn7 = new JButton("Button 7");
		GridBagConstraints constBtn7 = new GridBagConstraints();
		constBtn7.gridwidth = GridBagConstraints.REMAINDER;
		jPanel.add(btn7, constBtn7);

		JButton btn8 = new JButton("Button 8");
		GridBagConstraints constBtn8 = new GridBagConstraints();
		constBtn8.gridwidth = GridBagConstraints.REMAINDER;
		jPanel.add(btn8, constBtn8);

		mainContainer.add(jPanel);
	}

}
