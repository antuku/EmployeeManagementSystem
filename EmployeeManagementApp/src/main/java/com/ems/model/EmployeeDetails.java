package com.ems.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class EmployeeDetails {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empID;
		
	public long getEmpID() {
		return empID;
	}


	public void setEmpID(long empID) {
		this.empID = empID;
	}


	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_mailid")
	private String empMailID;
	
	@Column(name="emp_mob")
	private String empMob;
	
	@Column(name="emp_loc")
	private String empLoc;
	
	@Column(name="emp_Designation")
	private String empDesignation;
	
	
	@Column(name="emp_dob")
	private Date empDOB;

}
