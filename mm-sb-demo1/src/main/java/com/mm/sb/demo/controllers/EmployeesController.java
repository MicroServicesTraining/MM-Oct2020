/**
 * 
 */
package com.mm.sb.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.demo.dao.EmployeesDAO;
import com.mm.sb.demo.model.Employee;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/api/v1/emps")
public class EmployeesController {
	
	@Autowired
	private EmployeesDAO employeesDAO;
	
	@GetMapping()
	public List<Employee> getAllEmployees(){
		return employeesDAO.getAllEmployees();
	}
	
	@PutMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		employeesDAO.save(employee);
		return employee;
	}
	
}
