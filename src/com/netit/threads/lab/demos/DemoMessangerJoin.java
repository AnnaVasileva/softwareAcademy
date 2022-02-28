// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.demos;

import java.util.Arrays;
import java.util.List;

import com.netit.threads.lab.helpers.LineType;
import com.netit.threads.lab.helpers.MessangerCoorporation;
import com.netit.threads.lab.helpers.PrintLineThreadJoin;

public class DemoMessangerJoin {

	public static void main(String[] args) {

		List<LineType> list = Arrays.asList(LineType.values());

		MessangerCoorporation eMessangerCoorporation = new MessangerCoorporation(list);
		Thread bob1Thread = new PrintLineThreadJoin(eMessangerCoorporation, 0);
		Thread alice1Thread = new PrintLineThreadJoin(eMessangerCoorporation, 1);
		Thread bob2Thread = new PrintLineThreadJoin(eMessangerCoorporation, 2);
		Thread alice2Thread = new PrintLineThreadJoin(eMessangerCoorporation, 3);
		try {
			bob1Thread.start();
			bob1Thread.join();

			alice1Thread.start();
			alice1Thread.join();

			bob2Thread.start();
			bob2Thread.join();

			alice2Thread.start();
			alice2Thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
