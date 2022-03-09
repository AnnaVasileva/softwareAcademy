// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JPopupMenu;

public class PizzaGeneratorActionListener implements ActionListener {

	private List<JCheckBox> checkBoxList;
	private Container mainContainer;

	public PizzaGeneratorActionListener(List<JCheckBox> checkBoxList, Container mainContainer) {
		this.checkBoxList = checkBoxList;
		this.mainContainer = mainContainer;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();

		if (command.equals("generate")) {
			StringBuilder msgBld = new StringBuilder();
			msgBld.append("Your pizza has: ");
			for (JCheckBox jCheckBox : checkBoxList) {
				if (jCheckBox.isSelected()) {
					String text = jCheckBox.getText();
					msgBld.append(text + ", ");
				}
			}

			msgBld.deleteCharAt(msgBld.length() - 1);
			msgBld.deleteCharAt(msgBld.length() - 1);

			JPopupMenu popupMenu = new JPopupMenu();
			popupMenu.add(msgBld.toString());
			popupMenu.setBackground(Color.GREEN);
			popupMenu.setVisible(true);
			int x = mainContainer.getWidth() / 2 - popupMenu.getWidth() / 2;
			int y = mainContainer.getHeight() / 2 - popupMenu.getHeight() / 2;
			popupMenu.setLocation(x, y);

		}

	}

}
