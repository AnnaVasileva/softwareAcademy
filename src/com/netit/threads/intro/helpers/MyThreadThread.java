// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.intro.helpers;

public class MyThreadThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority());
	}

}
