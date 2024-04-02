package com.job.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.job.model.JobPost;
import com.job.service.JobService;

@RestController
public class RestJobController 
{
	@Autowired
	JobService service;
	
	@GetMapping("/jobPosts")
	public List<JobPost> viewJobs()
	{
		return service.getJobs();
	}
	
	@GetMapping("/jobPost/exp/{reqExperience}")
	public List<JobPost> findPostExp(@PathVariable int reqExperience)
	{
		return service.postExp(reqExperience);
	}
	
	@GetMapping("/jobPost/desc/{postDesc}")
	public List<JobPost> findPostDesc(@PathVariable String postDesc)
	{
		return service.postDesc(postDesc);
	}
	
	@GetMapping("/jobPost/{postId}")
	public Optional<JobPost> viewJob(@PathVariable int postId)
	{
		return service.getJob(postId);
	}
	
	@PostMapping("/jobPosts")
	public String putJob(@RequestBody JobPost job)
	{
		service.addJob(job);
		return "success";
	}
	
	@PutMapping("/jobPosts")
	public String updateJob(@RequestBody JobPost job)
	{
		service.updateJob(job);
		return "Updated";
	}
	
	@DeleteMapping("/jobPosts/{postId}")
	public String deleteJob(JobPost job)
	{
		service.deleteJob(job);
		return "deleted";
	}

}
