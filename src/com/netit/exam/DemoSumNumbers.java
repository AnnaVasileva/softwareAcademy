// © 2022 Anna Vasileva. All rights reserved.

package com.netit.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoSumNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers - ");
		String[] inputString = sc.nextLine().split(" ");
		List<Integer> input = new ArrayList<>();
		for (String element : inputString) {
			input.add(Integer.parseInt(element));
		}

		int sum = 0;
		for (Integer element : input) {
			sum += element;
		}

		if (sum < 0) {
			System.out.println("negative");
		} else if (sum >= 0) {
			System.out.println("positve");
		}

		sc.close();

	}

}
