// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.intro.helpers;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class FactorialThread implements Callable<BigInteger> {

	private int start;
	private int end;

	public FactorialThread(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public BigInteger call() {
		BigInteger result = BigInteger.ONE;
		for (int i = start; i <= end; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;

	}
}
