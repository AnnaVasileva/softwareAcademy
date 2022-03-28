// © 2022 Anna Vasileva. All rights reserved.

package com.netit.exam.companytask;

import java.util.List;

public interface HRService {

	List<Employee> findAllEmployees();

	List<Developer> findAllDevelopers();

	List<Manager> findAllManagers();

	int findAllSalaries();

	Employee changeSalary(Employee employee, int increase);

}
