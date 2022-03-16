// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.helpers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ShopClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel headerPanel = new JPanel();
		JButton homeButton = new JButton("Home");
		homeButton.setActionCommand("home");
		homeButton.addActionListener(new HeaderActionLister(mainContainer));
		JButton profileButton = new JButton("My Profile");
		profileButton.setActionCommand("profile");
		profileButton.addActionListener(new HeaderActionLister(mainContainer));

		FlowLayout headerLayout = new FlowLayout(FlowLayout.RIGHT);
		headerPanel.setLayout(headerLayout);
		headerPanel.add(homeButton);
		headerPanel.add(profileButton);
		headerPanel.setBackground(new Color(66, 103, 178));

		JPanel sidePanel = new JPanel();
		String[] products = { "Toys", "Gadgets" };
		JList<String> productList = new JList<>(products);
		productList.addListSelectionListener(new SidePanelSelectionListener(mainContainer));
		productList.setBackground(new Color(112, 173, 71));
		sidePanel.add(productList);
		sidePanel.setBackground(new Color(112, 173, 71));

		JPanel contentPanel = new JPanel();
		JLabel contentLabel = new JLabel("Welcome to our shop!");
		contentPanel.add(contentLabel);

		JPanel footerPanel = new JPanel();
		JLabel footerLabel = new JLabel("Footer");
		footerPanel.add(footerLabel);
		footerPanel.setBorder(new LineBorder(Color.GRAY));

		BorderLayout borderLayout = new BorderLayout();
		mainContainer.setLayout(borderLayout);
		mainContainer.add(headerPanel, BorderLayout.NORTH);
		mainContainer.add(sidePanel, BorderLayout.WEST);
		mainContainer.add(contentPanel, BorderLayout.CENTER);
		mainContainer.add(footerPanel, BorderLayout.SOUTH);

	}

}
