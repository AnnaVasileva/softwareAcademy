package com.netit.threads.intro.demos;

import com.netit.threads.intro.helpers.MyRunnableThread;
import com.netit.threads.intro.helpers.SleepyThread;

public class DemoJoin {

	public static void main(String[] args) {

		Runnable runnableThread = new MyRunnableThread();
		Thread regularThread = new Thread(runnableThread, "RegularThread");

		Runnable sleepyRunnableThread = new SleepyThread();
		Thread sleepyThread = new Thread(sleepyRunnableThread, "SleepyThread");

		sleepyThread.start();
		try {
			sleepyThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sleepyThread.getState());
		regularThread.start();

	}

}
