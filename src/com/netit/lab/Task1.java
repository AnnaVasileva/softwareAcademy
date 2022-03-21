// © 2022 Anna Vasileva. All rights reserved.

package com.netit.lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter numbers - ");
		String[] inputChars = sc.nextLine().split(" ");
		List<Integer> numbers = new ArrayList<>();
		for (String element : inputChars) {
			numbers.add(Integer.parseInt(element));
		}

		Set<Integer> result = new HashSet<>(numbers);

		for (Integer element : result) {
			System.out.printf(element + " ");
		}

		sc.close();
	}
}
