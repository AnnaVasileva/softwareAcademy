// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.gridlayout.helpers;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldGeneratorActionListener implements ActionListener {

	private JPanel jPanel;
	private Container mainContainer;

	public TextFieldGeneratorActionListener(JPanel jPanel, Container mainContainer) {
		this.jPanel = jPanel;
		this.mainContainer = mainContainer;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();

		if (command.equals("generateAction")) {
			JTextField rowsField = (JTextField) jPanel.getComponent(1);
			String rowsString = rowsField.getText();
			int rows = Integer.parseInt(rowsString);

			JTextField columnsField = (JTextField) jPanel.getComponent(3);
			String columnsString = columnsField.getText();
			int columns = Integer.parseInt(columnsString);

			int filedsNumber = rows * columns;
			JPanel textFieldsPanel = new JPanel();
			for (int i = 0; i < filedsNumber; i++) {
				textFieldsPanel.add(new JTextField());
			}
			GridLayout gridLayout = new GridLayout(rows, columns, 5, 5);
			textFieldsPanel.setLayout(gridLayout);
			mainContainer.add(textFieldsPanel);
		}

		mainContainer.validate();
		mainContainer.repaint();

	}

}
