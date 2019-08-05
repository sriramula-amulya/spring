package com.dbs.empmgmt.aspects;

import java.util.Arrays;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class LoggingAspect {

	@Before("within(com.dbs.emp_mgmt.*.*)")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Before executing the method :: ");
        Arrays.asList(joinPoint.getArgs()).forEach(System.out::println);
    }
	@After("within(com.dbs.empmgmt.*.*)")
	public void logAfter(JoinPoint joinPoint)
	{
		System.out.println("After executing the method :: ");
		Arrays.asList(joinPoint.getArgs()).forEach(System.out::println);
	}
}
