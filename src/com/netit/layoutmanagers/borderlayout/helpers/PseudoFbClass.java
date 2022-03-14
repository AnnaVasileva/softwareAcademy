// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.helpers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PseudoFbClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel mainPanel = new JPanel();
		BorderLayout borderLayout = new BorderLayout();
		mainPanel.setLayout(borderLayout);

		JTextField header = new JTextField("Welcome");
		header.setEditable(false);
		header.setBackground(new Color(91, 155, 213));
		mainPanel.add(header, BorderLayout.NORTH);

		JTextField footer = new JTextField("Copyright (c) 2022");
		footer.setEditable(false);
		footer.setBorder(new LineBorder(Color.GRAY));
		mainPanel.add(footer, BorderLayout.SOUTH);

		String[] grps = { "Group1", "Group2", "Group3" };
		JList<String> groups = new JList<>(grps);
		groups.addListSelectionListener(new PseudoFbListSelectionListenr(mainPanel));
		mainPanel.add(groups, BorderLayout.WEST);

		String[] ppl = { "PersonA", "PersonB", "PersonC" };
		JList<String> people = new JList<>(ppl);
		people.addListSelectionListener(new PseudoFbListSelectionListenr(mainPanel));
		mainPanel.add(people, BorderLayout.EAST);

		mainContainer.add(mainPanel);

	}

}
