package com.tap.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tap.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
	
	Employee findById(int eid);

}
