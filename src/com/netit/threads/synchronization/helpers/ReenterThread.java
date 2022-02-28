package com.netit.threads.synchronization.helpers;

public class ReenterThread extends Thread {

	private Object obj;

	public ReenterThread(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		synchronized (this.obj) {
			System.out.println("First time entering");

			synchronized (this.obj) {
				System.out.println("Entering again");

				synchronized (this.obj) {
					System.out.println("And again");
				}
			}
		}
	}

}
