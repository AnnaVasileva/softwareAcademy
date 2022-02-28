package com.netit.threads.intro.demos;

import java.util.Arrays;
import java.util.List;

public class DemoDaemon {

	public static void main(String[] args) {

		Thread deamondThread = new Thread();
		Thread regularThread = new Thread();

		deamondThread.setDaemon(true);

		deamondThread.start();
		regularThread.start();

		List<Thread> threads = Arrays.asList(deamondThread, regularThread);
		for (Thread thread : threads) {
			if (thread.isDaemon()) {
				System.out.println(thread.getName() + " is daemon");
			} else {
				System.out.println(thread.getName() + " is regular thread");
			}
		}

	}

}
