// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.helpers;

public class MultiplySyncBlock {

	public void multiplySyncBlock(int num) {
		// Synchronized block
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(num + "*" + i + " = " + num * i);
			}
		}
	}

}
