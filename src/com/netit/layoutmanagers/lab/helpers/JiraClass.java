// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.helpers;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JiraClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel headerPanel = new JPanel();
		JLabel companyLogo = new JLabel("OurCompanyLogo");
		JButton exitButton = new JButton("Exit");
		exitButton.setActionCommand("exit");
		exitButton.addActionListener(new ExitActionListener(mainContainer));

		BorderLayout headerLayout = new BorderLayout();
		headerPanel.setLayout(headerLayout);
		headerPanel.add(companyLogo, BorderLayout.WEST);
		headerPanel.add(exitButton, BorderLayout.EAST);

		JPanel contentPanel = new JPanel();
		JPanel leftPanel = new JPanel();

		JTextField[][] data = new JTextField[4][5];
		String[] column = { "MON", "TUE", "WED", "THU", "FRI" };
		JTable jTable = new JTable(data, column);
		jTable.setCellSelectionEnabled(true);
		JScrollPane scrollPane = new JScrollPane(jTable);
		leftPanel.add(scrollPane);

		JPanel rightPanel = new JPanel();
		GridLayout rightLayout = new GridLayout(0, 1);
		rightPanel.setLayout(rightLayout);
		for (int i = 0; i < 5; i++) {
			rightPanel.add(new JButton("Issue " + i));
		}

		GridLayout contentLayout = new GridLayout(0, 2);
		contentPanel.setLayout(contentLayout);
		contentPanel.add(leftPanel);
		contentPanel.add(rightPanel);

		BorderLayout containerLayout = new BorderLayout();
		mainContainer.setLayout(containerLayout);
		mainContainer.add(headerPanel, BorderLayout.NORTH);
		mainContainer.add(contentPanel, BorderLayout.CENTER);

	}

}
