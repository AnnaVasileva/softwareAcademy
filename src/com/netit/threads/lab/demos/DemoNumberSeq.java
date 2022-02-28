// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.demos;

import com.netit.threads.lab.helpers.PrintNumberThread;

public class DemoNumberSeq {

	public static void main(String[] args) {

		Thread thread1 = new PrintNumberThread(1);
		Thread thread2 = new PrintNumberThread(2);
		Thread thread3 = new PrintNumberThread(3);
		Thread thread4 = new PrintNumberThread(4);

		try {
			thread1.start();
			thread1.join();

			thread2.start();
			thread2.join();

			thread3.start();
			thread3.join();

			thread4.start();
			thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
