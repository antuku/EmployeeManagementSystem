package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.EmployeeDetails;
import com.ems.service.EmployeeService;

@RestController
@RequestMapping("api/ems")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping
	public ResponseEntity<EmployeeDetails> saveEmployee(@RequestBody EmployeeDetails employee) {
		return new ResponseEntity<EmployeeDetails>(empService.saveEmployee(employee), HttpStatus.CREATED);
	}

	@GetMapping
	public List<EmployeeDetails> getAllEmployees() {

		return empService.getAllEmployees();
	}

	@PutMapping({ "empID" })
	public ResponseEntity<EmployeeDetails> updateEmployee(@RequestBody EmployeeDetails employee,
			@PathVariable("empID") long empID) {
		return new ResponseEntity<EmployeeDetails>(empService.updateEmployee(employee, empID), HttpStatus.OK);
	}

	@DeleteMapping({ "empID" })
	public ResponseEntity<String> updateEmployee(@PathVariable("empID") long empID) {

		empService.deleteEmployee(empID);
		return new ResponseEntity<String>("Employee Deleted Successfully!!!", HttpStatus.OK);
	}

}
