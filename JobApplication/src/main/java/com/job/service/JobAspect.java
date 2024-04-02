package com.job.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JobAspect 
{
	@Before(value = "execution(* com.job.controller.JobRestController.*(..))")
	public void beforeAdvice(JoinPoint jp)
	{
		System.out.println("Before Called "+jp.getSignature());
	}
	
	@After(value = "execution(* com.job.controller.JobRestController.*(..))")
	public void afterAdvice(JoinPoint jp)
	{
		System.out.println("After Called "+jp.getSignature());
	}
	
	@AfterReturning(value = "execution(* com.job.controller.JobRestController.*(..))")
	public void afterReturnAdvice(JoinPoint jp)
	{
		System.out.println("After Return Called "+jp.getSignature());
	}

	

}
