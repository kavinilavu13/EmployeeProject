package com.employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EmployeeFileHandlerDAO implements EmployeeDAO{
	@Override
	public String addEmployee(Employee emp)throws IOException
	{
		String response;
		System.out.println("add employee");
		String addEmployee = emp.getId() + "," + emp.getName() + "," + emp.getAge() + "," + emp.getSalary() + ","+ emp.getAddress();
		File fout = new File("D:\\data.txt");
		FileOutputStream fos = new FileOutputStream(fout, true);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		if (addEmployee.isEmpty()) {
			response = "Employee data are not add successfully";
		} else {
			bw.write(addEmployee);
			bw.newLine();
			bw.close();
			response = "Employee data are add successfully";
			
		}
		return response;
	}

	@Override
	public String deleteEmployee(int id) throws IOException
	{
		FileReader fr = new FileReader("D:\\data.txt");
		BufferedReader br = new BufferedReader(fr);
		String Line = br.readLine();
		while (Line != null) {
			String[] linesplit = Line.split(",");
			int lineLength = linesplit.length;
			String empid = linesplit[0];
			int employeeId = Integer.parseInt(empid);
			if (employeeId == id) {
				System.out.println(Line);
			}
			Line = br.readLine();
		}
		br.close();
		return null;
	}
	
	@Override
	public String editEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
