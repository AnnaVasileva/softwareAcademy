package com.netit.threads.synchronization.demos;

import com.netit.threads.synchronization.helpers.MultiplySyncMethod;
import com.netit.threads.synchronization.helpers.SyncMethodThread;

public class DemoSynchronizedMethod {

	public static void main(String[] args) {

		MultiplySyncMethod multiply = new MultiplySyncMethod();
		Thread simpleThread1 = new SyncMethodThread(multiply, 5);
		Thread simpleThread2 = new SyncMethodThread(multiply, 10);

		simpleThread1.start();
		simpleThread2.start();

	}

}
