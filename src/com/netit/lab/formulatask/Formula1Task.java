// © 2022 Anna Vasileva. All rights reserved.

package com.netit.lab.formulatask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Formula1Task {

	private static final int TOTAL_RACE_NUMBER = 22;

	public static void main(String[] args) {

		DriverF1 drv1 = new DriverF1("Hamilton", 0, 10);
		DriverF1 drv2 = new DriverF1("Bottas", 0, 10);
		Mechanic mech1 = new Mechanic("Ivan", 0, 1);
		List<DriverF1> mcDrivers = Arrays.asList(drv1, drv2);
		Team merc = new Team("Mercedes", mcDrivers, mech1, 0);

		DriverF1 drv3 = new DriverF1("Lando", 0, 10);
		DriverF1 drv4 = new DriverF1("Daniel", 0, 10);
		Mechanic mech2 = new Mechanic("Petyr", 0, 1);
		List<DriverF1> mcLarenDrivers = Arrays.asList(drv3, drv4);
		Team mcLaren = new Team("McLaren", mcLarenDrivers, mech2, 0);

		DriverF1 drv5 = new DriverF1("Tsunoda", 0, 10);
		DriverF1 drv6 = new DriverF1("Gasly", 0, 10);
		Mechanic mech3 = new Mechanic("Ivana", 0, 1);
		List<DriverF1> aTDrivers = Arrays.asList(drv5, drv6);
		Team alphTauri = new Team("Alpha Tauri", aTDrivers, mech3, 0);

		DriverF1 drv7 = new DriverF1("Max", 0, 10);
		DriverF1 drv8 = new DriverF1("Sergio", 0, 10);
		Mechanic mech4 = new Mechanic("Petrana", 0, 1);
		List<DriverF1> rbDrivers = Arrays.asList(drv7, drv8);
		Team redBull = new Team("Red Bull", rbDrivers, mech4, 0);

		List<Team> teams = Arrays.asList(mcLaren, merc, alphTauri, redBull);
		for (int i = 0; i < TOTAL_RACE_NUMBER; i++) {
			runRace(teams);
		}

		Mechanic topMechanic = teams.get(0).getMechanic();
		for (Team team : teams) {
			if (topMechanic.getWonRaces() < team.getMechanic().getWonRaces()) {
				topMechanic = team.getMechanic();
			}

			System.out.println(team.getName() + " - " + team.getPoints());
		}
		System.out.println("------------------");
		System.out.println("Top mechanic is: " + topMechanic.getName() + " - " + topMechanic.getWonRaces());

	}

	public static void runRace(List<Team> teams) {
		RaceRsult raceResult = new RaceRsult();
		List<Map<DriverF1, Team>> winners = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			Random random = new Random();
			Team teamWinner = teams.get(random.nextInt(teams.size()));
			List<DriverF1> drivers = teamWinner.getDrivers();

			Map<DriverF1, Team> driver = Map.of(drivers.get(0), teamWinner);
			if (winners.contains(driver)) {
				driver = Map.of(drivers.get(1), teamWinner);
				if (winners.contains(driver)) {
					i--;
					continue;
				}
			}

			switch (i) {
			case 1:
				raceResult.setFirstDriver(driver);
				raceResult.setMechanic(teamWinner.getMechanic());
				break;
			case 2:
				raceResult.setSecondDriver(driver);
				break;
			case 3:
				raceResult.setThirdDriver(driver);
				break;
			default:
				break;
			}

			winners.add(driver);
		}

		raceResult.addPoints();
		raceResult.addWonRace();

		List<DriverF1> winnerDrivers = raceResult.findAllDrivers();
		for (DriverF1 driverF1 : winnerDrivers) {
			System.out.println(driverF1.getName() + " - " + driverF1.getWonRaces());
		}
		System.out.println("--------------");
	}

}
