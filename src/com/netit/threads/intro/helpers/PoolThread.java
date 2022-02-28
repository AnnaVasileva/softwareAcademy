package com.netit.threads.intro.helpers;

public class PoolThread implements Runnable {

	private int iterationNumber;

	public PoolThread(int iterationNumber) {
		this.iterationNumber = iterationNumber;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start " + iterationNumber);
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " End " + System.nanoTime());
	}

}
