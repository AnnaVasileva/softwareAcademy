// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

public class FibonacciRecursiveThread extends Thread {

	private int number;
	private int answer;

	public FibonacciRecursiveThread(int number) {
		this.number = number;
	}

	public int getAnswer() {
		return answer;
	}

	@Override
	public void run() {
		if (number == 1) {
			answer = 0;
		} else if (number == 2) {
			answer = 1;
		} else {
			FibonacciRecursiveThread frt1 = new FibonacciRecursiveThread(number - 1);
			FibonacciRecursiveThread frt2 = new FibonacciRecursiveThread(number - 2);
			try {
				frt1.start();
				frt2.start();
				frt1.join();
				frt2.join();

				answer = frt1.getAnswer() + frt2.getAnswer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
