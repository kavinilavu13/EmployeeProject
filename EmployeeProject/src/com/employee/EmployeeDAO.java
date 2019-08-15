package com.employee;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface EmployeeDAO {
public String addEmployee(Employee emp) throws IOException;
public String editEmployee(int id);
public String deleteEmployee(int  id) throws FileNotFoundException, IOException;

}
