/**
 * 
 */
package com.mm.sb.jpa.demo.reopositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mm.sb.jpa.demo.model.JobPosting;

/**
 * @author dorak
 *
 */
public interface JobPostingRepository extends JpaRepository<JobPosting, Long>{

}
