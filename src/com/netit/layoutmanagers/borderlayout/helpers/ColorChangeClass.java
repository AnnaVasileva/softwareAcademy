// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.helpers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ColorChangeClass extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel headerPanel = new JPanel();
		JLabel headerPanelLabel = new JLabel("My Header");
		headerPanel.add(headerPanelLabel);
		headerPanel.setBackground(new Color(91, 155, 213));

		JPanel contentPanel = new JPanel();
		JLabel contentPanelLabel = new JLabel("Content Panel");
		contentPanel.add(contentPanelLabel);

		JPanel navigationPanel = new JPanel();
		JLabel navigationPanelLabel = new JLabel("Navigation Panel");
		navigationPanel.setBackground(new Color(112, 173, 71));

		JButton yellowBtn = new JButton("Yellow Btn");
		yellowBtn.setActionCommand("yellow");
		yellowBtn.addActionListener(new ColorChangeActionListener(contentPanel));
		JButton orangeBtn = new JButton("Orange Btn");
		orangeBtn.setActionCommand("orange");
		orangeBtn.addActionListener(new ColorChangeActionListener(contentPanel));
		JButton resetBtn = new JButton("Reset");
		resetBtn.setActionCommand("reset");
		resetBtn.addActionListener(new ColorChangeActionListener(contentPanel));

		BoxLayout boxLayout = new BoxLayout(navigationPanel, BoxLayout.Y_AXIS);
		navigationPanel.setLayout(boxLayout);
		navigationPanel.add(navigationPanelLabel);
		navigationPanel.add(yellowBtn);
		navigationPanel.add(orangeBtn);
		navigationPanel.add(resetBtn);

		JPanel footerPanel = new JPanel();
		JLabel footerPanelLabel = new JLabel("My Footer");
		footerPanel.add(footerPanelLabel);
		footerPanel.setBorder(new LineBorder(Color.GRAY));

		BorderLayout borderLayout = new BorderLayout();
		mainContainer.setLayout(borderLayout);
		mainContainer.add(headerPanel, BorderLayout.NORTH);
		mainContainer.add(contentPanel, BorderLayout.CENTER);
		mainContainer.add(navigationPanel, BorderLayout.WEST);
		mainContainer.add(footerPanel, BorderLayout.SOUTH);

	}

}
