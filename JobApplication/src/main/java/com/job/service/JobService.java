package com.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.model.JobPost;
import com.job.repository.JobRepo;
import com.job.repository.JobRepoDb;

@Service
public class JobService 
{
	@Autowired
	JobRepoDb repo;
	//JobRepo repo;

	public void addJob(JobPost job) 
	{
		repo.save(job);
		
	}

	public List<JobPost> getJobs()
	{
		return repo.findAll();
		
	}

	public Optional<JobPost> getJob(int postId) 
	{
		return repo.findById(postId);
		
		
	}

	public void updateJob(JobPost job) 
	{
		repo.save(job);
		
		
	}

	public void deleteJob(JobPost job) 
	{
		repo.save(job);
		
	}

	public List<JobPost> postExp(int reqExperience) 
	{
		return repo.findByReqExperience(reqExperience);
				
	}

	public List<JobPost> postDesc(String postDesc) 
	{
		
		return repo.findByPostDesc(postDesc);
	}

}
