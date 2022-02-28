// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

import java.util.List;

public class ListEvenOddNumbersMutualExclusive {

	private List<Integer> list;

	public ListEvenOddNumbersMutualExclusive(List<Integer> list) {
		this.list = list;
	}

	public synchronized void printNumbers(NumberType numberType) {

		for (Integer element : list) {
			if (NumberType.EVEN.equals(numberType) && element % 2 == 0) {
				System.out.printf("%s is even.\n", element);
			} else if (NumberType.ODD.equals(numberType) && element % 2 != 0) {
				System.out.printf("%s is odd.\n", element);
			}

		}

	}

}
