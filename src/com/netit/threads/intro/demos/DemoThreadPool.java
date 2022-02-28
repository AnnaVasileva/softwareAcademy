package com.netit.threads.intro.demos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.netit.threads.intro.helpers.PoolThread;

public class DemoThreadPool {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(15);
		for (int i = 0; i < 5; i++) {
			executor.execute(new PoolThread(i));
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
			// intentionally empty
		}

	}

}
