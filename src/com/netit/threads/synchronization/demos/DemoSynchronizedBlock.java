// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.demos;

import com.netit.threads.synchronization.helpers.MultiplySyncBlock;
import com.netit.threads.synchronization.helpers.SyncBlockThread;

public class DemoSynchronizedBlock {

	public static void main(String[] args) {

		MultiplySyncBlock multiplySyncBlock = new MultiplySyncBlock();
		Thread simpleThread1 = new SyncBlockThread(multiplySyncBlock, 5);
		Thread simpleThread2 = new SyncBlockThread(multiplySyncBlock, 100);

		simpleThread1.start();
		simpleThread2.start();

	}

}
