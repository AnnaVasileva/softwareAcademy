// © 2022 Anna Vasileva. All rights reserved.

package com.netit.lab.formulatask;

public class DriverF1 extends Person {
	private int experience;

	public DriverF1(String name, int wonRaces, int experience) {
		super(name, wonRaces);
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
