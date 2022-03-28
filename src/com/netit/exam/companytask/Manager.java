// © 2022 Anna Vasileva. All rights reserved.

package com.netit.exam.companytask;

public class Manager extends Employee {

	private int managedPeopleNumber;

	public Manager(String name, int experience, int salary, int managedPeopleNumber) {
		super(name, experience, salary, Position.MANAGER);
		this.managedPeopleNumber = managedPeopleNumber;
	}

	public int getManagedPeopleNumber() {
		return managedPeopleNumber;
	}

	public void setManagedPeopleNumber(int managedPeopleNumber) {
		this.managedPeopleNumber = managedPeopleNumber;
	}

}
