// © 2022 Anna Vasileva. All rights reserved.

package com.netit.exam.companytask;

public class Employee {

	protected String name;
	protected int experience;
	protected int salary;
	private Position position;

	public Employee(String name, int experience, int salary, Position position) {
		this.name = name;
		this.experience = experience;
		this.salary = salary;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
