// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.helpers;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreeButtonsClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel leftButtonPanel = new JPanel();
		leftButtonPanel.add(new JButton("Left"));
		leftButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel rightButtonPanel = new JPanel();
		rightButtonPanel.add(new JButton("Right"));
		rightButtonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		JPanel centerButtonPanel = new JPanel();
		centerButtonPanel.add(new JButton("Center"));
		centerButtonPanel.setLayout(new FlowLayout());

		BoxLayout boxLayout = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);
		mainContainer.setLayout(boxLayout);
		mainContainer.add(leftButtonPanel);
		mainContainer.add(rightButtonPanel);
		mainContainer.add(centerButtonPanel);

	}

}
