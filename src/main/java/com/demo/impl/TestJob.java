package com.demo.impl;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class TestJob implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("");

	}

}
