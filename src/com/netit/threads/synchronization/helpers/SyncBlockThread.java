package com.netit.threads.synchronization.helpers;

public class SyncBlockThread extends Thread {

	private int num;
	private MultiplySyncBlock multiplyObject;

	public SyncBlockThread(MultiplySyncBlock multiplyObject, int num) {
		this.multiplyObject = multiplyObject;
		this.num = num;
	}

	@Override
	public void run() {
		multiplyObject.multiplySyncBlock(num);
	}

}
