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
			System.out.println(selected);
			Component[] components = jPanel.getComponents();
			BorderLayout borderLayout = (BorderLayout) jPanel.getLayout();
			for (Component component : components) {
				if (borderLayout.getConstraints(component).equals(BorderLayout.CENTER)) {
					jPanel.remove(component);
				}
			}
			JTextArea textArea = new JTextArea("This is " + selected + "\n"
					+ " Lorem ipsum dolor sit amet, consectetur "
					+ "adipiscing elit. Donec nec erat augue. Nulla id auctor eros. Pellentesque fringilla nulla quis dui "
					+ "lacinia, eget imperdiet augue egestas. Praesent sit amet sem dignissim, lobortis lorem sit amet,"
					+ " pharetra velit. Aenean ac risus eget ligula porttitor lacinia id nec urna. Suspendisse suscipit "
					+ "tempus neque vel mollis. Sed ultricies quis tortor in malesuada. Aliquam tempus, quam at dignissim "
					+ "pulvinar, eros tortor scelerisque ipsum, id rhoncus ipsum turpis et lacus. Maecenas faucibus pretium nunc, ut semper elit venenatis ac.\r\n"
					+ "\r\n"
					+ "Aenean dictum odio nisi, ac convallis neque tristique ac. Mauris vitae tortor sed diam venenatis dapibus et faucibus enim. Morbi molestie placerat turpis. Vivamus tempor, odio sed varius tempus, tellus ante rhoncus purus, a gravida ante dui eget odio. Aliquam id ex sit amet nulla auctor commodo eget a quam. Donec sit amet ultrices quam, tristique porta urna. Vivamus vitae pulvinar nibh. Phasellus ac efficitur justo. Maecenas posuere, ex sed iaculis scelerisque, lorem quam viverra leo, pharetra aliquam diam nibh a quam. Phasellus nisl leo, accumsan eu porttitor vel, placerat sed lorem.\r\n"
					+ "\r\n"
					+ "Nulla commodo, libero sed maximus luctus, mi nisi rutrum ipsum, ut bibendum velit justo eget nisi. Phasellus quis egestas massa, vel aliquam lacus. Cras feugiat dapibus justo, eget venenatis ex posuere in. Pellentesque porttitor at justo egestas pulvinar. Proin accumsan, turpis a luctus laoreet, libero dolor tincidunt turpis, id dignissim erat ex vel lacus. In imperdiet egestas tortor, aliquam commodo lorem lacinia eu. Nullam fermentum at tortor vel dapibus. Suspendisse eget diam tincidunt libero dignissim fringilla. Nullam eget leo dolor. Sed in iaculis nulla, ut tempor urna. Etiam commodo, justo et varius tempus, massa metus volutpat ante, at feugiat neque sapien quis tellus. Curabitur a aliquet velit. Nullam vitae turpis sapien. Praesent vel dolor quis leo volutpat venenatis quis eget tellus. Sed id convallis tellus. Sed lobortis, nisi et imperdiet convallis, massa elit venenatis sem, id lacinia risus augue vel libero.\r\n"
					+ "\r\n"
					+ "Suspendisse cursus aliquet nisi vel vehicula. Phasellus mauris turpis, tincidunt quis egestas id, blandit in libero. Curabitur a lacus turpis. Vivamus rutrum quam non facilisis condimentum. Ut porttitor lectus vel mauris convallis rhoncus. Suspendisse tellus lacus, commodo laoreet purus nec, blandit suscipit libero. Etiam feugiat nibh a lacus fermentum, vitae volutpat massa suscipit. Mauris vel libero orci. Nam eu arcu metus. Nullam scelerisque ligula non nibh bibendum, nec fringilla dolor vehicula. Sed sodales odio non porta convallis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nulla tincidunt diam velit, vel blandit ante hendrerit quis. Proin tincidunt, nisi et commodo dictum, nulla libero luctus orci, eu feugiat magna felis quis justo. ");
			textArea.setFont(new Font("San-Serif", Font.ITALIC, 12));
			textArea.setLineWrap(true);

			JScrollPane scrollPane = new JScrollPane(textArea);
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			jPanel.add(scrollPane, BorderLayout.CENTER);
			jPanel.validate();
			jPanel.repaint();
		}

	}

}
