// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.helpers;

public class DeadlockResource2 extends Thread {

	String resource1;
	String resource2;

	public DeadlockResource2(String resource1, String resource2) {
		this.resource1 = resource1;
		this.resource2 = resource2;
	}

	@Override
	public void run() {
		synchronized (resource2) {
			System.out.println("Thread 2: locked " + resource2);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (resource1) {
				System.out.println("Thread 2: locked" + resource1);
			}
		}
	}
}
