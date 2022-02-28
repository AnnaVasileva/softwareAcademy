// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.lab.helpers;

public enum LineType {

	BOB1("B: Hi, Alice!"), ALICE1("A: Hi, Bob!"), BOB2("B: What are you doing?"), ALICE2("A: I'm coding.");

	public final String label;

	private LineType(String label) {
		this.label = label;
	}

}
