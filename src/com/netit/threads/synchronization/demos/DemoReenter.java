// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.demos;

import com.netit.threads.synchronization.helpers.ReenterThread;

public class DemoReenter {
	public static void main(String[] args) {

		int obj = 5;

		Thread thread1 = new ReenterThread(obj);
		thread1.start();
	}
}
