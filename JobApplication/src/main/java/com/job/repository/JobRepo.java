package com.job.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.job.model.JobPost;

@Repository
public class JobRepo 
{

	
		List<JobPost> jobs = new ArrayList<JobPost>(Arrays.asList());
		
		//add
		public void addJob(JobPost job)
		{
			jobs.add(job);
			System.out.println(jobs);
		
		
	}
		
		//get job
		public List<JobPost> getJobs() 
		{
			return jobs;			
		}
		
		public JobPost getJob(int postId) 
		{
			for(JobPost job:jobs)
			{
				if(job.getPostId()==postId)
				{
					return job;
					
				}
			}
			return null;
			
		}
		
		//update
		public void updateJob(JobPost job)
		{
			for(JobPost jp:jobs)
			{
				if(jp.getPostId()==job.getPostId())
				{
					//jp=job;  not working
					jp.setPostDesc(job.getPostDesc());
					jp.setReqExperience(job.getReqExperience());
					jp.setPostTechStack(job.getPostTechStack());
				}
				
			}
			
			
			
		}
		
		//delete
		public void deleteJob(JobPost job) 
		{
			for(JobPost jp:jobs)
			{
				if (jp.getPostId()==job.getPostId())
				{
					jobs.remove(jp);
				}
						
			}
		}

}
