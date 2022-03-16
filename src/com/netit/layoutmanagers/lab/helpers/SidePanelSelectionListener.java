// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.lab.helpers;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SidePanelSelectionListener implements ListSelectionListener {

	private Container mainContainer;

	public SidePanelSelectionListener(Container mainContainer) {
		this.mainContainer = mainContainer;
	}

	@Override
	public void valueChanged(ListSelectionEvent event) {

		if (event.getSource() instanceof JList) {
			JList source = (JList) event.getSource();
			String selected = source.getSelectedValue().toString();

			Component[] components = mainContainer.getComponents();
			BorderLayout containerLayout = (BorderLayout) mainContainer.getLayout();
			for (Component component : components) {
				if (containerLayout.getConstraints(component).equals(BorderLayout.NORTH)) {
					JPanel headerPanel = (JPanel) component;
					JButton homeButton = (JButton) headerPanel.getComponent(0);
					homeButton.setEnabled(true);
					JButton profileButton = (JButton) headerPanel.getComponent(1);
					profileButton.setEnabled(true);
				} else if (containerLayout.getConstraints(component).equals(BorderLayout.CENTER)) {
					mainContainer.remove(component);
				}
			}

			JPanel newContentPanel = new JPanel();
			if (selected.equals("Toys")) {
				GridLayout gridLayout = new GridLayout(3, 0);
				newContentPanel.setLayout(gridLayout);
				for (int i = 0; i < 5; i++) {
					newContentPanel.add(new JButton("Toy " + i));
				}
			} else if (selected.equals("Gadgets")) {
				GridLayout gridLayout = new GridLayout(0, 3);
				newContentPanel.setLayout(gridLayout);
				for (int i = 0; i < 10; i++) {
					newContentPanel.add(new JButton("Gadget " + i));
				}
			}

			mainContainer.add(newContentPanel, BorderLayout.CENTER);
			mainContainer.validate();
			mainContainer.repaint();

		}

	}

}
