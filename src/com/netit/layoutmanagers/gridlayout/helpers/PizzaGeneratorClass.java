// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PizzaGeneratorClass extends JFrame {
	public void addComponents(Container mainContainer) {
		JPanel cheesePanel = new JPanel();
		JLabel cheeseLabel = new JLabel("Select Cheese: ");
		JCheckBox mozzarellaCB = new JCheckBox("Mozzarella");
		JCheckBox parmezanCB = new JCheckBox("Parmezan");
		JCheckBox cheddarCB = new JCheckBox("Cheddar");

		GridLayout gridLayout = new GridLayout(0, 1);
		cheesePanel.setLayout(gridLayout);
		cheesePanel.add(cheeseLabel);
		cheesePanel.add(mozzarellaCB);
		cheesePanel.add(parmezanCB);
		cheesePanel.add(cheddarCB);

		JPanel vegePanel = new JPanel();
		JLabel vegeLabel = new JLabel("Select Vegetables: ");
		JCheckBox cornCB = new JCheckBox("Corn");
		JCheckBox pineappleCB = new JCheckBox("Pineapple");
		JCheckBox tomatoesCB = new JCheckBox("Tomatoes");

		vegePanel.setLayout(gridLayout);
		vegePanel.add(vegeLabel);
		vegePanel.add(cornCB);
		vegePanel.add(pineappleCB);
		vegePanel.add(tomatoesCB);

		JPanel meatPanel = new JPanel();
		JLabel meatLabel = new JLabel("Select Meat: ");
		JCheckBox chickenCB = new JCheckBox("Chicken");
		JCheckBox porkCB = new JCheckBox("Pork");
		JCheckBox beefCB = new JCheckBox("Beef");

		meatPanel.setLayout(gridLayout);
		meatPanel.add(meatLabel);
		meatPanel.add(chickenCB);
		meatPanel.add(porkCB);
		meatPanel.add(beefCB);

		JPanel menuPanel = new JPanel();
		BoxLayout box = new BoxLayout(menuPanel, BoxLayout.X_AXIS);
		menuPanel.setLayout(box);
		menuPanel.add(cheesePanel);
		menuPanel.add(vegePanel);
		menuPanel.add(meatPanel);

		JButton generateButton = new JButton("Generate");
		generateButton.setActionCommand("generate");
		List<JCheckBox> checkBoxes = new ArrayList<>();
		Component[] cheeseComponents = cheesePanel.getComponents();
		for (Component component : cheeseComponents) {
			if (component instanceof JCheckBox) {
				checkBoxes.add((JCheckBox) component);
			}
		}

		Component[] vegeComponents = vegePanel.getComponents();
		for (Component component : vegeComponents) {
			if (component instanceof JCheckBox) {
				checkBoxes.add((JCheckBox) component);
			}
		}

		Component[] meatComponents = meatPanel.getComponents();
		for (Component component : meatComponents) {
			if (component instanceof JCheckBox) {
				checkBoxes.add((JCheckBox) component);
			}
		}

		generateButton.addActionListener(new PizzaGeneratorActionListener(checkBoxes, mainContainer));

		BoxLayout mainBox = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);
		mainContainer.setLayout(mainBox);
		mainContainer.add(menuPanel);
		mainContainer.add(generateButton);

	}

}
