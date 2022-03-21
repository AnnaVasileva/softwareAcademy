// © 2022 Anna Vasileva. All rights reserved.

package com.netit.lab.formulatask;

public class Mechanic extends Person {

	private int constructedCars;

	public Mechanic(String name, int wonRaces, int constructedCars) {
		super(name, wonRaces);
		this.constructedCars = constructedCars;
	}

	public int getConstructedCars() {
		return constructedCars;
	}

	public void setConstructedCars(int constructedCars) {
		this.constructedCars = constructedCars;
	}

}
