// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.demos;

import com.netit.threads.synchronization.helpers.DeadlockResource1;
import com.netit.threads.synchronization.helpers.DeadlockResource2;

public class DemoDeadlock {
	public static void main(String[] args) {

		final String resource1 = "resource1";
		final String resource2 = "resource2";

		Thread t1 = new DeadlockResource1(resource1, resource2);
		Thread t2 = new DeadlockResource2(resource1, resource2);

		t1.start();
		t2.start();

	}
}
