// © 2022 Anna Vasileva. All rights reserved.

package com.netit.lab.formulatask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RaceRsult {

	private Map<DriverF1, Team> firstDriver;
	private Map<DriverF1, Team> secondDriver;
	private Map<DriverF1, Team> thirdDriver;
	private Mechanic mechanic;

	public RaceRsult() {
	}

	public Map<DriverF1, Team> getFirstDriver() {
		return firstDriver;
	}

	public void setFirstDriver(Map<DriverF1, Team> firstDriver) {
		this.firstDriver = firstDriver;
	}

	public Map<DriverF1, Team> getSecondDriver() {
		return secondDriver;
	}

	public void setSecondDriver(Map<DriverF1, Team> secondDriver) {
		this.secondDriver = secondDriver;
	}

	public Map<DriverF1, Team> getThirdDriver() {
		return thirdDriver;
	}

	public void setThirdDriver(Map<DriverF1, Team> thirdDriver) {
		this.thirdDriver = thirdDriver;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	public void addPoints() {
		for (Entry<DriverF1, Team> entry : firstDriver.entrySet()) {
			Team team = entry.getValue();
			team.setPoints(team.getPoints() + 25);
		}

		for (Entry<DriverF1, Team> entry : secondDriver.entrySet()) {
			Team team = entry.getValue();
			team.setPoints(team.getPoints() + 18);
		}

		for (Entry<DriverF1, Team> entry : thirdDriver.entrySet()) {
			Team team = entry.getValue();
			team.setPoints(team.getPoints() + 15);
		}

	}

	public void addWonRace() {
		for (Entry<DriverF1, Team> entry : firstDriver.entrySet()) {
			DriverF1 driver = entry.getKey();
			driver.setWonRaces(driver.getWonRaces() + 1);
		}
		mechanic.setWonRaces(mechanic.getWonRaces() + 1);

	}

	public List<DriverF1> findAllDrivers() {
		List<DriverF1> result = new ArrayList<>();
		for (Entry<DriverF1, Team> entry : firstDriver.entrySet()) {
			DriverF1 driver = entry.getKey();
			result.add(driver);
		}

		for (Entry<DriverF1, Team> entry : secondDriver.entrySet()) {
			DriverF1 driver = entry.getKey();
			result.add(driver);
		}

		for (Entry<DriverF1, Team> entry : thirdDriver.entrySet()) {
			DriverF1 driver = entry.getKey();
			result.add(driver);
		}

		return result;
	}

}
