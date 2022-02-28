package com.netit.threads.intro.helpers;

public class WaitingThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
