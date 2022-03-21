// © 2022 Anna Vasileva. All rights reserved.

package com.netit.lab.formulatask;

public class Person {

	protected String name;
	protected int wonRaces;

	public Person(String name, int wonRaces) {
		this.name = name;
		this.wonRaces = wonRaces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWonRaces() {
		return wonRaces;
	}

	public void setWonRaces(int wonRaces) {
		this.wonRaces = wonRaces;
	}

}
