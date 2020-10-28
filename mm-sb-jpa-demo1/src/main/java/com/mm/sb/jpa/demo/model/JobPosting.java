/**
 * 
 */
package com.mm.sb.jpa.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dorak
 *
 */
@Entity
@Table(name="job_posting")
public class JobPosting {
	
	@Id
	private Long jobPostingId;
	private String jobTitle;
	private String Description;
	private Double salary;
	/**
	 * @return the jobPostingId
	 */
	public Long getJobPostingId() {
		return jobPostingId;
	}
	/**
	 * @param jobPostingId the jobPostingId to set
	 */
	public void setJobPostingId(Long jobPostingId) {
		this.jobPostingId = jobPostingId;
	}
	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
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
