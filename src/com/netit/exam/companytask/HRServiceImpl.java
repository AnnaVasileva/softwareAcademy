// © 2022 Anna Vasileva. All rights reserved.

package com.netit.exam.companytask;

import java.util.ArrayList;
import java.util.List;

public class HRServiceImpl implements HRService {

	private List<Employee> employees;

	public HRServiceImpl(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public List<Employee> findAllEmployees() {
		return this.employees;
	}

	@Override
	public List<Developer> findAllDevelopers() {
		List<Developer> result = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getPosition().equals(Position.DEVELOPER)) {
				Developer developer = (Developer) employee;
				result.add(developer);
			}
		}
		return result;
	}

	@Override
	public List<Manager> findAllManagers() {
		List<Manager> result = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getPosition().equals(Position.MANAGER)) {
				Manager manager = (Manager) employee;
				result.add(manager);
			}
		}
		return result;
	}

	@Override
	public int findAllSalaries() {
		int result = 0;
		for (Employee employee : employees) {
			result += employee.getSalary();
		}
		return result;
	}

	@Override
	public Employee changeSalary(Employee employee, int increase) {
		int currentSalary = employee.getSalary();
		employee.setSalary(currentSalary + increase);
		return employee;
	}

}
