package com.netit.threads.synchronization.helpers;

public class BlockedThread implements Runnable {

	@Override
	public void run() {
		heavyProcess();
	}

	public static synchronized void heavyProcess() {
		while (true) {
		}
	}

}
