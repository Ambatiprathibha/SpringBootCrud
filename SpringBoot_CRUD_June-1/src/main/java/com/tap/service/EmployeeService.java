package com.tap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tap.entity.Employee;
import com.tap.repo.EmployeeRepository;



@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List)employeeRepo.findAll();
		
	}

	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(eid);
		
	}

	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepo.save(emp);
		
	}

	public Employee updateEmployee(int eid, Employee emp) {
		// TODO Auto-generated method stub
		
		if(employeeRepo.findById(eid)!=null) {
			return employeeRepo.save(emp);
		}
		return null;
	}

	public String deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(eid);
		return "deleted sucessfully......";
	}

	
}
