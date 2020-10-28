/**
 * 
 */
package com.mm.sb.jpa.demo.controllers;

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

import com.mm.sb.jpa.demo.model.JobPosting;
import com.mm.sb.jpa.demo.reopositories.JobPostingRepository;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("jobpostings")
public class JobPostingsController {

	@Autowired
	private JobPostingRepository jobPostingRepository;
	
	@GetMapping
	public List<JobPosting> getAllJobPostings(){
		return jobPostingRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public JobPosting getJobById(@PathVariable("id") Long id) {
		return jobPostingRepository.getOne(id);
	}
	
	@PostMapping
	public JobPosting createJobPosting(@RequestBody JobPosting jobPosting) {
		return jobPostingRepository.save(jobPosting);
	}
	
	@PutMapping
	public JobPosting updateJobPosting(@RequestBody JobPosting jobPosting) {
		return jobPostingRepository.save(jobPosting);
	}
	
	@DeleteMapping("/{id}/")
	public void removeJobPosting(@PathVariable("id") Long id ) throws Exception {
		JobPosting jobPosting = jobPostingRepository.findById(id).orElseThrow(Exception :: new);
		jobPostingRepository.delete(jobPosting);
	}
	
	
}
