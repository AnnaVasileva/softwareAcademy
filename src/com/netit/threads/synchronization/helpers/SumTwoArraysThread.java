package com.netit.threads.synchronization.helpers;

import java.util.concurrent.Callable;

public class SumTwoArraysThread implements Callable<Integer> {

	private int num1;
	private int num2;

	public SumTwoArraysThread(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public Integer call() throws Exception {
		return num1 + num2;
	}

}
