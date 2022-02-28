// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.demos;

import com.netit.threads.synchronization.helpers.SumElementsThread;
import com.netit.threads.synchronization.helpers.SumTwoArraysThread;

public class DemoSumArrays {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 1, 2, 3 };

		SumElementsThread sumElementsArr1 = new SumElementsThread(arr1);
		SumElementsThread sumElementsArr2 = new SumElementsThread(arr2);

		try {
			Integer sum1 = sumElementsArr1.call();
			Integer sum2 = sumElementsArr2.call();

			SumTwoArraysThread sumArrsThread = new SumTwoArraysThread(sum1, sum2);
			System.out.println(sumArrsThread.call());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
