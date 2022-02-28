package com.netit.threads.intro.demos;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.netit.threads.intro.helpers.FactorialThread;

public class DemoTasksFactorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter number - ");

		int number = scanner.nextInt();

		// Iterative
		long startTimeIterative = System.nanoTime();
		BigInteger factorialIterative = findFactorialIterative(number);
		long stopTimeIterative = System.nanoTime();
		long durationIterative = stopTimeIterative - startTimeIterative;
		System.out.printf("%d! = %s; Iterative = %d%n", number, factorialIterative, durationIterative);

		// Threads
		ExecutorService executor = Executors.newFixedThreadPool(2);
		long startTimeMyThreads = System.nanoTime();
		Future<BigInteger> subResult1 = executor.submit(new FactorialThread(1, number / 2));
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Future<BigInteger> subResult2 = executor.submit(new FactorialThread(number / 2 + 1, number));
		executor.shutdown();
		while (!executor.isTerminated()) {
			// intentionally empty
		}

		BigInteger result = BigInteger.ZERO;
		try {
			result = subResult1.get().multiply(subResult2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		long stopTimeMyThreads = System.nanoTime();
		long durationMyThreads = stopTimeMyThreads - startTimeMyThreads;
		System.out.printf("%d! = %s; Threads = %d%n", number, result, durationMyThreads);

		scanner.close();

	}

	private static BigInteger findFactorialIterative(int number) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= number; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

}
