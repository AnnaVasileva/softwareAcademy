package com.netit.threads.intro.demos;

import java.lang.Thread.State;
import java.util.concurrent.TimeUnit;

public class DemoState {

	public static void main(String[] args) {

		// State NEW
		Thread firstThread = new Thread();
		State stateNew = firstThread.getState();
		System.out.println(stateNew);

		// State RUNNABLE
		firstThread.start();
		State stateRunnable = firstThread.getState();
		System.out.println(stateRunnable);

		// State TERMINATE
		System.out.println("Sleeping...");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		State stateTerminated = firstThread.getState();
		System.out.println(stateTerminated);

	}

}
