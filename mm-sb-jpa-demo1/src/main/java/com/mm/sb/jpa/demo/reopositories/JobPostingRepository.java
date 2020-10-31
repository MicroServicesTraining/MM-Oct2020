/**
 * 
 */
package com.mm.sb.jpa.demo.reopositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mm.sb.jpa.demo.model.JobPosting;

/**
 * @author dorak
 *
 */
@Repository
public interface JobPostingRepository extends JpaRepository<JobPosting, Long>{

	@Query("select jp from JobPosting jp where jp.jobTitle = :jobtitle")
	public List<JobPosting> findByTitle(@Param("jobtitle") String jobtitle);
	
	@Query("select jp from JobPosting jp where jp.salary = :salary")
	public List<JobPosting> findBySalary(@Param("salary") Double salary);
	
	@Query("select jp from JobPosting jp where jp.salary >= :minsalary and jp.salary <= :maxsalary")
	public List<JobPosting> findJobPostingsBySalaryRange(@Param("minsalary") Double minsalary, @Param("maxsalary") Double maxsalary);
	
	@Query("select jp from JobPosting jp where jp.jobTitle like '%:title%'")
	public List<JobPosting> findJobPostingsByMatch(@Param("title") String title);
	
	//Native query
	@Query(value = "select * from job_posting jp where jp.salary >= :salary", nativeQuery=true)
	public List<JobPosting> findBySalaryMorethan(@Param("salary") Double salary);
	

}
