// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.intro.helpers;

public class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s - %d%n", Thread.currentThread().getName(), i);
		}
	}
}
