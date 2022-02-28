// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

import java.util.List;

public class ListEvenOddNumbersObjCoop {

	private List<Integer> list;

	public ListEvenOddNumbersObjCoop(List<Integer> list) {
		this.list = list;
	}

	public synchronized void printEventNumber(int index) {
		Integer element = this.list.get(index);

		if (element % 2 != 0) {
			System.out.println("Waiting for an even number....");
			try {
				this.wait(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.printf("%s is even.\n", element);
			notifyAll();
		}
	}

	public synchronized void printOddNumber(int index) {
		Integer element = this.list.get(index);

		if (element % 2 == 0) {
			System.out.println("Waiting for an odd number....");
			try {
				this.wait(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.printf("%s is odd.\n", element);
			notifyAll();
		}
	}

}
