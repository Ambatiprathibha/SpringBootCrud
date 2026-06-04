package com.tap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.entity.Employee;
import com.tap.service.EmployeeService;
@RestController

//@Controller
//@ResponseBody

public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping("/Employee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}
	@GetMapping("Employee/{id}")
	public Employee getEmployee(@PathVariable("id") int eid) {
		return employeeService.getEmployee(eid);
	}
	
	@PostMapping("Employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return employeeService.addEmployee(emp);
	}
	
	@PutMapping("Employee/{id}")
	public Employee updateEmployee(@PathVariable("id") int eid,@RequestBody Employee emp ) {
		return employeeService.updateEmployee(eid,emp);
	}
	@DeleteMapping("Employee/{id}")
	public String deleteEmployee(@PathVariable("id") int eid) {
		return employeeService.deleteEmployee(eid);
	}
	
	

}
