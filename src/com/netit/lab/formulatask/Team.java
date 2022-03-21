// © 2022 Anna Vasileva. All rights reserved.

package com.netit.lab.formulatask;

import java.util.List;

import com.netit.draft.lab.formula1.DriverF1;

public class Team {

	private String name;
	private List<DriverF1> drivers;
	private Mechanic mechanic;
	private int points;

	public Team(String name, List<DriverF1> drivers, Mechanic mechanic, int points) {
		this.name = name;
		this.drivers = drivers;
		this.mechanic = mechanic;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DriverF1> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<DriverF1> drivers) {
		this.drivers = drivers;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
