// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.demos;

import java.util.Scanner;

import com.netit.threads.lab.helpers.FibonacciRecursiveThread;

public class DemoFibunacciRecursive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter number -");
		int number = sc.nextInt();

		FibonacciRecursiveThread fibonacciRecursiveThr = new FibonacciRecursiveThread(number);
		fibonacciRecursiveThr.start();
		try {
			fibonacciRecursiveThr.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(fibonacciRecursiveThr.getAnswer());

		sc.close();

	}

}
