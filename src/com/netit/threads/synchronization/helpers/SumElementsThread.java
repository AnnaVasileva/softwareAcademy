// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.helpers;

import java.util.concurrent.Callable;

public class SumElementsThread implements Callable<Integer> {

	private int[] arr;

	public SumElementsThread(int[] arr) {
		this.arr = arr;
	}

	@Override
	public Integer call() throws Exception {
		Integer result = 0;
		for (Integer element : arr) {
			result += element;
		}
		return result;
	}

}
