package com.netit.threads.synchronization.demos;

import com.netit.threads.synchronization.helpers.SyncStaticMethodThread;

public class DemoSynchronizedStaticMehod {

	public static void main(String[] args) {

		Thread simpleThread1 = new SyncStaticMethodThread(5);
		Thread simpleThread2 = new SyncStaticMethodThread(100);

		simpleThread1.start();
		simpleThread2.start();

	}

}
