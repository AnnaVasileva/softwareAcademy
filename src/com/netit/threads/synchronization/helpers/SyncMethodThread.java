package com.netit.threads.synchronization.helpers;

public class SyncMethodThread extends Thread {

	private MultiplySyncMethod multiplyObject;
	private int num;

	public SyncMethodThread(MultiplySyncMethod multiplyObject, int num) {
		this.multiplyObject = multiplyObject;
		this.num = num;
	}

	@Override
	public void run() {
		multiplyObject.multiplySyncMethod(num);
	}

}
