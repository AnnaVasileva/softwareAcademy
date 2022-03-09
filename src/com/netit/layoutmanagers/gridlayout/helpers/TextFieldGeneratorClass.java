// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldGeneratorClass extends JFrame {

	public void addComponents(Container mainContainer) {
		JPanel jPanel = new JPanel();
		JLabel rowsNumLabel = new JLabel("Number of rows: ");
		JTextField rowsFiled = new JTextField(20);
		JLabel columnsNumLabel = new JLabel("Number of columns: ");
		JTextField columnsFiled = new JTextField(20);
		JButton generateButton = new JButton("Generate");
		generateButton.setActionCommand("generateAction");
		generateButton.addActionListener(new TextFieldGeneratorActionListener(jPanel, mainContainer));

		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
		jPanel.setLayout(flowLayout);
		jPanel.add(rowsNumLabel);
		jPanel.add(rowsFiled);
		jPanel.add(columnsNumLabel);
		jPanel.add(columnsFiled);
		jPanel.add(generateButton);

		BoxLayout box = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);
		mainContainer.setLayout(box);
		mainContainer.add(jPanel);

	}

}
