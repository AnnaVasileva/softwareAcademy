// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

public class PrintEvenNumbersThread extends Thread {

	private ListEvenOddNumbersObjCoop listObjc;
	private int index;

	public PrintEvenNumbersThread(ListEvenOddNumbersObjCoop listObjc, int index) {
		this.listObjc = listObjc;
		this.index = index;
	}

	@Override
	public void run() {
		listObjc.printEventNumber(index);
	}

}
