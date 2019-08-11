package com.employee;

import java.io.IOException;
import java.util.Scanner;

public class FileProcess {

	 public static void main(String[] args) throws IOException {
	    	
	    	Scanner input = new Scanner(System.in);	 
	    	System.out.println("Employee Management " );
	    	System.out.println("1.Add Employee");
	    	System.out.println("2.Remove Employee" );
	    	System.out.println("3.Edit Employee");
	    	System.out.print("Enter an integer: ");
	    	int number = input.nextInt();
	    	if(number==1)
	    	{

	    		System.out.println("Enter Employee details for add in file:");
	    		System.out.println("Enter Employee ID:");
	    		Scanner id = new Scanner(System.in);	 
	    		int Empid = id.nextInt();
	    		System.out.println("Enter Employee Name:");
	    		Scanner name = new Scanner(System.in);	 
	    		String EmpName = name.nextLine();
	    		System.out.println("Enter Employee Age:");
	    		Scanner age = new Scanner(System.in);	 
	    		int Empage = age.nextInt();
	    		System.out.println("Enter Employee Salary:");
	    		Scanner salary = new Scanner(System.in);	 
	    		int Empsalary = salary.nextInt();
	    		System.out.println("Enter Employee Address:");
	    		Scanner address = new Scanner(System.in);	 
	    		String Empaddress= address.nextLine();
	    		
	    		System.out.println(Empid+","+EmpName+","+Empage+","+Empsalary+","+Empaddress);
	    		Employee emp=new Employee();
	    		emp.setId(Empid);
	    		emp.setName(EmpName);
	    		emp.setAge(Empage);
	    		emp.setSalary(Empsalary);
	    		emp.setAddress(Empaddress);	    		
	    		EmployeeProcess empprocess=new EmployeeProcess();
	    		String response=empprocess.addEmployee(emp);
	    		System.out.println(response);
	   
	    	}
	    	else if(number==2)
	    	{
	    		System.out.println("Enter Employee ID for Remove from file:");
	    		Scanner id = new Scanner(System.in);	 
	    		int Empid = id.nextInt();
	    		EmployeeProcess empprocess=new EmployeeProcess();
	    		empprocess.deleteEmployee(Empid);
	    	}
	    	else if(number==3)
	    	{

	    		System.out.println();
	    	}
	    	else
	    	{
	    		System.out.println("please enter valid number");
	    	}
	    	
	    	
	    }

}
