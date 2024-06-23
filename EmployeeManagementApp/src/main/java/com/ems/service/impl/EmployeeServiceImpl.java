package com.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ems.exception.ResourceNotFoundException;
import com.ems.model.EmployeeDetails;
import com.ems.repo.EmployeeRepo;
import com.ems.service.EmployeeService;

public class EmployeeServiceImpl {

	@Autowired
	EmployeeService empService;

	@Autowired
	EmployeeRepo empRepo;

	public EmployeeDetails saveEmployee(EmployeeDetails employee) {
		return empRepo.save(employee);
	}

	public List<EmployeeDetails> getAllEmployees() {
		return empRepo.findAll();
	}

	public EmployeeDetails updateEmployee(EmployeeDetails employee, long empID) {

		EmployeeDetails existingEmp = empRepo.findById(empID)
				.orElseThrow(() -> new ResourceNotFoundException("EmployeeDetails", "empID", "empID"));

		existingEmp.setEmpID(empID);

		empRepo.save(existingEmp);

		return existingEmp;

	}

	public void deleteEmployee(long empID) {

		empRepo.findById(empID).orElseThrow(() -> new ResourceNotFoundException("EmployeeDetails", "empID", "empID"));

		empRepo.deleteById(empID);

	}

}
