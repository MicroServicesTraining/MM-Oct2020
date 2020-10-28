/**
 * 
 */
package com.mm.sb.demo.model;

/**
 * @author dorak
 *
 */
public class Employee  {
	
	private Long empId;
	private String name;
	private Integer age;
	private String department;
	private Double salary;
	

	/**
	 * 
	 */
	public Employee() {
	}
	/**
	 * @param empId
	 * @param name
	 * @param age
	 * @param department
	 * @param salary
	 */
	public Employee(Long empId, String name, Integer age, String department, Double salary) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
}
