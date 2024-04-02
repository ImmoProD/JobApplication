package com.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class JobApplication 
{

	public static void main(String[] args) {
		SpringApplication.run(JobApplication.class, args);
	}

}
