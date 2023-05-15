package com.mangesh.persist;

import com.mangesh.model.Employee;

public interface EmployeeDao {
	
	public String saveEmployee(Employee employee);

	public Employee getEmployee(int id);
	
	
}
