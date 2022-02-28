// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.helpers;

public class DeadlockResource1 extends Thread {

	String resource1;
	String resource2;

	public DeadlockResource1(String resource1, String resource2) {
		this.resource1 = resource1;
		this.resource2 = resource2;
	}

	@Override
	public void run() {
		synchronized (resource1) {
			System.out.println("Thread 1: locked " + resource1);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (resource2) {
				System.out.println("Thread 1: locked " + resource2);
			}
		}
	}

}
