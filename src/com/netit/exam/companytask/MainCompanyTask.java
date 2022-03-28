// © 2022 Anna Vasileva. All rights reserved.

package com.netit.exam.companytask;

import java.util.Arrays;
import java.util.List;

public class MainCompanyTask {

	public static void main(String[] args) {

		List<KnowledgeEnum> l1 = Arrays.asList(KnowledgeEnum.PYTHON);
		List<KnowledgeEnum> l2 = Arrays.asList(KnowledgeEnum.JAVA);
		List<KnowledgeEnum> l3 = Arrays.asList(KnowledgeEnum.JAVA, KnowledgeEnum.PYTHON);
		Developer dev1 = new Developer("Petra", 2, 1000, l1);
		Developer dev2 = new Developer("Ivana", 6, 3000, l2);
		Developer dev3 = new Developer("Bobi", 10, 6000, l3);

		Manager man1 = new Manager("Toni", 3, 1500, 3);
		Manager man2 = new Manager("Aleks", 7, 3500, 23);
		Manager man3 = new Manager("Stamat", 14, 7500, 34);

		List<Employee> employees = Arrays.asList(dev1, dev2, dev3, man1, man2, man3);
		HRServiceImpl hrs = new HRServiceImpl(employees);

		System.out.println("Total Salaries before increaces: " + hrs.findAllSalaries());

		Manager topManager = man1;
		for (Employee employee : hrs.findAllEmployees()) {
			if (employee.getPosition().equals(Position.DEVELOPER)) {
				Developer developer = (Developer) employee;
				if (developer.getKnowledge().size() == 1 && developer.getKnowledge().contains(KnowledgeEnum.PYTHON)) {
					hrs.changeSalary(developer, 100);
				} else if (developer.getKnowledge().size() == 1
						&& developer.getKnowledge().contains(KnowledgeEnum.JAVA)) {
					hrs.changeSalary(developer, 300);
				} else {
					hrs.changeSalary(developer, 400);
				}
			} else if (employee.getPosition().equals(Position.MANAGER)) {
				Manager manager = (Manager) employee;
				int peopleManaged = manager.getManagedPeopleNumber();
				if (topManager.getManagedPeopleNumber() < peopleManaged) {
					topManager = manager;
				}
			}
		}

		System.out.println("Managers number: " + hrs.findAllManagers().size());
		System.out.println("Developer number: " + hrs.findAllDevelopers().size());
		System.out.println("Top manager:" + topManager.getName());
		System.out.println("Total Salaries after increaces: " + hrs.findAllSalaries());

	}

}
