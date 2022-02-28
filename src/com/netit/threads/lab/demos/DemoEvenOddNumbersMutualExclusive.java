// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.demos;

import java.util.Arrays;
import java.util.List;

import com.netit.threads.lab.helpers.ListEvenOddNumbersMutualExclusive;
import com.netit.threads.lab.helpers.NumberType;
import com.netit.threads.lab.helpers.PrintEvenOddNumbersThread;

public class DemoEvenOddNumbersMutualExclusive {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 243546, 5687);
		ListEvenOddNumbersMutualExclusive listObj = new ListEvenOddNumbersMutualExclusive(list);
		Thread evenThread = new Thread(new PrintEvenOddNumbersThread(listObj, NumberType.EVEN));
		Thread oddThread = new Thread(new PrintEvenOddNumbersThread(listObj, NumberType.ODD));

		evenThread.start();
		oddThread.start();

	}

}
