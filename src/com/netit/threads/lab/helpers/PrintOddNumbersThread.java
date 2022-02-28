// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

public class PrintOddNumbersThread extends Thread {

	private ListEvenOddNumbersObjCoop listObjc;
	private int index;

	public PrintOddNumbersThread(ListEvenOddNumbersObjCoop listObjc, int index) {
		this.listObjc = listObjc;
		this.index = index;
	}

	@Override
	public void run() {
		listObjc.printOddNumber(index);
	}

}
