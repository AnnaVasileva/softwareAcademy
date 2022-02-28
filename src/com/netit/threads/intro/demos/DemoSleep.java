// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.intro.demos;

import com.netit.threads.intro.helpers.MyRunnableThread;
import com.netit.threads.intro.helpers.SleepyThread;

public class DemoSleep {

	public static void main(String[] args) {

		Runnable runnableThread = new MyRunnableThread();
		Thread regularThread = new Thread(runnableThread, "RegularThread");

		Runnable sleepyRunnableThread = new SleepyThread();
		Thread sleepyThread = new Thread(sleepyRunnableThread, "SleepyThread");

		regularThread.start();
		sleepyThread.start();

	}

}
