package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.model.EmployeeDetails;

@Service
public interface EmployeeService {
	
	public EmployeeDetails saveEmployee(EmployeeDetails employee);
	public List<EmployeeDetails> getAllEmployees();
	public EmployeeDetails updateEmployee(EmployeeDetails employee, long empID);
	public void deleteEmployee(long empID);

}
