package com.employee;

import java.io.IOException;

public class EmployeeService {

	EmployeeDAO EmployeeDAO;

	EmployeeService(EmployeeDAO employeeDAO) {
		this.EmployeeDAO = employeeDAO;
	}

	public String addEmployeeData(Employee emp) throws IOException {
		String response = EmployeeDAO.addEmployee(emp);
		return response;
	}

	public String deleteEmployeeData(int id) throws IOException {
		String response = EmployeeDAO.deleteEmployee(id);
		return response;

	}

}
