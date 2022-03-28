// © 2022 Anna Vasileva. All rights reserved.

package com.netit.exam;

import java.util.Scanner;

public class DemoWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number - ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;

		default:
			System.out.println("Invalid data!");
			break;
		}

		sc.close();

	}

}
