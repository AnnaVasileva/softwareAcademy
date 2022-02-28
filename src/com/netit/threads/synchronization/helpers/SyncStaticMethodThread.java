// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.helpers;

public class SyncStaticMethodThread extends Thread {

	private int num;

	public SyncStaticMethodThread(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		MultiplySyncStaticMethod.multiplySyncStaticMethod(num);
	}

}
