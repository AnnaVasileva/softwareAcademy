// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

public class PrintEvenOddNumbersThread extends Thread {

	private ListEvenOddNumbersMutualExclusive listObj;
	private NumberType numberType;

	public PrintEvenOddNumbersThread(ListEvenOddNumbersMutualExclusive listObj, NumberType numberType) {
		this.listObj = listObj;
		this.numberType = numberType;
	}

	@Override
	public void run() {
		listObj.printNumbers(numberType);
	}

}
