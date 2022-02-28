// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

public class PrintNumberThread extends Thread {

	private int number;

	public PrintNumberThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println(number);
	}

}
