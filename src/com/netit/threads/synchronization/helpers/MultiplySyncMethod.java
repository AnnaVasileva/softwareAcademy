package com.netit.threads.synchronization.helpers;

public class MultiplySyncMethod {

	public synchronized void multiplySyncMethod(int num) {
		for (int i = 0; i < 5; i++) {
			System.out.println(num + "*" + i + " = " + num * i);
		}
	}

}
