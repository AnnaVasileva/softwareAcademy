// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

import java.util.List;

public class MessangerCoorporation {

	private List<LineType> lines;

	public MessangerCoorporation(List<LineType> lines) {
		this.lines = lines;
	}

	public void printLine(int lineNumber) {
		LineType line = lines.get(lineNumber);
		System.out.println(line.label);
	}

}
