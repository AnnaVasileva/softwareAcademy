// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.intro.demos;

import java.util.Arrays;
import java.util.List;

public class DemoPriority {

	public static void main(String[] args) {

		Thread threadMaxPr = new Thread("ThreadMaxPr");
		Thread threadMinPr = new Thread("ThreadMinPr");
		Thread threadNormPr = new Thread("ThreadNormPr");
		Thread threadDefaultPr = new Thread("ThreadDefaultPr");

		threadMaxPr.setPriority(Thread.MAX_PRIORITY);
		threadMinPr.setPriority(Thread.MIN_PRIORITY);
		threadNormPr.setPriority(Thread.NORM_PRIORITY);

		List<Thread> threads = Arrays.asList(threadMaxPr, threadMinPr, threadNormPr, threadDefaultPr);
		for (Thread thread : threads) {
			System.out.printf("%s - %d%n", thread.getName(), thread.getPriority());
		}

	}

}
