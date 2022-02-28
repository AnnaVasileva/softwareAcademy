package com.netit.threads.synchronization.demos;

import com.netit.threads.synchronization.helpers.BlockedThread;

public class DemoBlockedThread {
	public static void main(String[] args) {

		Thread t1 = new Thread(new BlockedThread());
		Thread t2 = new Thread(new BlockedThread());

		t1.start();
		t2.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(t2.getState());
		System.out.println(t1.getState());
		System.exit(0);

	}
}
