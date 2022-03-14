// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.helpers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class StylePanel extends JFrame {

	public void addComponents(Container mainContainer) {

		JPanel headerPanel = new JPanel();
		JLabel headerLabel = new JLabel("My Header");
		headerPanel.add(headerLabel);
		headerPanel.setBackground(new Color(91, 155, 213));

		JPanel contentPanel = new JPanel();
		JLabel contentLabel = new JLabel("Choose View Style");
		contentPanel.add(contentLabel);

		JRadioButton europeanStyleButton = new JRadioButton("European Style", true);
		europeanStyleButton.setActionCommand("europeanStyle");
		europeanStyleButton.addActionListener(new StylePanelActionListener(mainContainer));
		JRadioButton arabStyleButton = new JRadioButton("Arab Style");
		arabStyleButton.setActionCommand("arabStyle");
		arabStyleButton.addActionListener(new StylePanelActionListener(mainContainer));

		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(europeanStyleButton);
		btnGroup.add(arabStyleButton);
		contentPanel.add(europeanStyleButton);
		contentPanel.add(arabStyleButton);

		JPanel navigationPanel = new JPanel();
		JLabel navigationPanelLabel = new JLabel("Navigation Panel");
		navigationPanel.add(navigationPanelLabel);
		navigationPanel.setBackground(new Color(112, 173, 71));

		BorderLayout borderLayout = new BorderLayout();
		mainContainer.setLayout(borderLayout);
		mainContainer.add(headerPanel, BorderLayout.PAGE_START);
		mainContainer.add(contentPanel);
		mainContainer.add(navigationPanel, BorderLayout.LINE_START);

	}

}
