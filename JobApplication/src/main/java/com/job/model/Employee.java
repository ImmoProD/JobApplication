package com.job.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empno;
	private String ename;
	private int sal;
	@Column(name = "dept_no")
	private int deptno;
	
	@ManyToOne
	@JoinColumn(name = "deptno", nullable= false)
	private Dept dept;

}
