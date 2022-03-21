// © 2022 Anna Vasileva. All rights reserved.

package com.netit.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter numbers - ");
		String[] inputNumbers = sc.nextLine().split(" ");
		List<Integer> numbers = new ArrayList<>();
		for (String element : inputNumbers) {
			numbers.add(Integer.parseInt(element));
		}

		List<Integer> result = new ArrayList<>();
		for (Integer element : numbers) {
			if (result.contains(element)) {
				result.remove(element);
			} else {
				result.add(element);
			}
		}

// Removed because is too slow
//		for (int i = 0; i < numbers.size() - 1; i++) {
//			for (int j = i + 1; j < numbers.size(); j++) {
//				if (numbers.get(i) == numbers.get(j)) {
//					numbers.remove(i);
//					numbers.remove(j - 1);
//					i--;
//				}
//			}
//		}

		for (Integer element : result) {
			System.out.printf(element + " ");
		}

		sc.close();
	}

}
