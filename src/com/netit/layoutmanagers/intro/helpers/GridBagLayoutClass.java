// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.intro.helpers;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutClass extends JFrame {

	public GridBagLayoutClass() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);

		GridBagConstraints gbConstraints = new GridBagConstraints();

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 0;
		this.add(new JButton("Btn 1"), gbConstraints);

		gbConstraints.gridx = 1;
		gbConstraints.gridy = 0;
		this.add(new JButton("Btn 2"), gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.ipady = 50;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 1;
		this.add(new JButton("Btn 3"), gbConstraints);

		gbConstraints.gridx = 1;
		gbConstraints.gridy = 1;
		this.add(new JButton("Btn 4"), gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 2;
		gbConstraints.ipady = 150;
		gbConstraints.gridwidth = 20;
		this.add(new JButton("Btn 5"), gbConstraints);

	}

}
