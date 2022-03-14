// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.borderlayout.helpers;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PseudoFbListSelectionListenr implements ListSelectionListener {

	private JPanel jPanel;

	public PseudoFbListSelectionListenr(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	@Override
	public void valueChanged(ListSelectionEvent listSelectionEvent) {

		if (!listSelectionEvent.getValueIsAdjusting() && listSelectionEvent.getSource() instanceof JList) {
			JList source = (JList) listSelectionEvent.getSource();
			String selected = source.getSelectedValue().toString();
			Component[] components = jPanel.getComponents();
			BorderLayout borderLayout = (BorderLayout) jPanel.getLayout();
			for (Component component : components) {
				if (borderLayout.getConstraints(component).equals(BorderLayout.CENTER)) {
					jPanel.remove(component);
				}
			}
			JTextArea textArea = new JTextArea("This is " + selected + "\n" + "longText");
			textArea.setFont(new Font("San-Serif", Font.ITALIC, 12));
			textArea.setLineWrap(true);

			JScrollPane scrollPane = new JScrollPane(textArea);
			jPanel.add(scrollPane, BorderLayout.CENTER);
			jPanel.validate();
			jPanel.repaint();
		}

	}

}
