/**
 * 
 */
package com.mm.sb.demo.dao;

import java.util.List;

import com.mm.sb.demo.model.Employee;

/**
 * @author dorak
 *
 */
public interface EmployeesDAO {
	
	public List<Employee> getAllEmployees();

	public Employee save(Employee employee);

}
