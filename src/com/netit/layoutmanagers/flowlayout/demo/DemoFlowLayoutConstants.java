// © 2022 Anna Vasileva. All rights reserved.

package com.netit.layoutmanagers.flowlayout.demo;

import javax.swing.WindowConstants;

import com.netit.layoutmanagers.flowlayout.helpers.FlowLayoutConstantsClass;

public class DemoFlowLayoutConstants {

	public static void main(String[] args) {

		FlowLayoutConstantsClass flowLayoutConstantsClass = new FlowLayoutConstantsClass();
		flowLayoutConstantsClass.setTitle("Leading vs Left Example");
		flowLayoutConstantsClass.addComponents(flowLayoutConstantsClass.getContentPane());
		flowLayoutConstantsClass.setSize(300, 200);
		flowLayoutConstantsClass.setVisible(true);
		flowLayoutConstantsClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
