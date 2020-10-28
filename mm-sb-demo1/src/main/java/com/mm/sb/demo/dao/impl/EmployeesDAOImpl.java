/**
 * 
 */
package com.mm.sb.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mm.sb.demo.dao.EmployeesDAO;
import com.mm.sb.demo.model.Employee;

/**
 * @author dorak
 *
 */
@Component
public class EmployeesDAOImpl implements EmployeesDAO{
	
	private List<Employee> employees;
	
	

	/**
	 * @param employees
	 */
	public EmployeesDAOImpl() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee(1001l, "Ramesh", 23, "Accounts", 12000.00));
		employees.add(new Employee(1002l, "Kamesh", 29, "HR", 20000.00));
		employees.add(new Employee(1003l, "Mamesh", 33, "Marketing", 15000.00));
		employees.add(new Employee(1004l, "Rajesh", 28, "Sales", 12000.00));
	}

	public List<Employee> getAllEmployees() {
			return this.employees;
	}

	public Employee save(Employee employee) {
		this.employees.add(employee);
		return employee;
	}
	
}
