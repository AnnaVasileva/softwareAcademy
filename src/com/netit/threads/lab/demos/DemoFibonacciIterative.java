// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.demos;

import java.util.Scanner;

import com.netit.threads.lab.helpers.FibonacciIterativeThread;

public class DemoFibonacciIterative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter number - ");
		int number = sc.nextInt();

		Runnable fibonacciThreadRunnable = new FibonacciIterativeThread(number);
		Thread fibonacciThread = new Thread(fibonacciThreadRunnable);
		fibonacciThread.start();

		sc.close();

	}

}
