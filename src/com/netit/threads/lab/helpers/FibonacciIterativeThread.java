// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

public class FibonacciIterativeThread implements Runnable {

	private int number;

	public FibonacciIterativeThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		int[] fibonacciRow = new int[number + 1];
		fibonacciRow[0] = 1;
		fibonacciRow[1] = 2;

		for (int i = 2; i < number; i++) {
			fibonacciRow[i] = fibonacciRow[i - 1] + fibonacciRow[i - 2];
		}

		System.out.println(fibonacciRow[number - 1]);

	}

}
