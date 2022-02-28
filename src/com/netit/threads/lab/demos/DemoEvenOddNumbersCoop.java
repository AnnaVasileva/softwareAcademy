// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.demos;

import java.util.Arrays;
import java.util.List;

import com.netit.threads.lab.helpers.ListEvenOddNumbersObjCoop;
import com.netit.threads.lab.helpers.PrintEvenNumbersThread;
import com.netit.threads.lab.helpers.PrintOddNumbersThread;

public class DemoEvenOddNumbersCoop {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 243546, 5687);

		ListEvenOddNumbersObjCoop listObj = new ListEvenOddNumbersObjCoop(list);
		for (int i = 0; i < list.size(); i++) {
			Thread evenThread = new PrintEvenNumbersThread(listObj, i);
			Thread oddThread = new PrintOddNumbersThread(listObj, i);

			evenThread.start();
			oddThread.start();
		}

	}

}
