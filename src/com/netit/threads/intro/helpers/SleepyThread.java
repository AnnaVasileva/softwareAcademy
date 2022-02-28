package com.netit.threads.intro.helpers;

public class SleepyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.printf("%s - %d%n", Thread.currentThread().getName(), i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
