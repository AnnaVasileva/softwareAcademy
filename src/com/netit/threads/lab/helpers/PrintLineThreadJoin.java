// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

public class PrintLineThreadJoin extends Thread {

	private MessangerCoorporation messangerCoorporation;
	private int lineNumber;

	public PrintLineThreadJoin(MessangerCoorporation messangerCoorporation, int lineNumber) {
		this.messangerCoorporation = messangerCoorporation;
		this.lineNumber = lineNumber;
	}

	@Override
	public void run() {
		messangerCoorporation.printLine(lineNumber);
	}

}
