package com.ems.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.model.EmployeeDetails;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetails,Long>{

}
