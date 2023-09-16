package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBaseProcess {

	//@Before("execution(public String getstudent())")
	@Before("execution(public * getstudent())")
	public void start() {
		System.out.println("Start...");
	}
	
	@After("execution(public String getstudent())")
	public void end() {
		System.out.println("End...");
	}
	
	@AfterReturning("execution(public String getstudent())")
	public void fainl() {
		System.out.println("Fainl...");
	}
	
	@AfterThrowing("execution(public * getstudent())")
	public void Exception() {
		System.out.println("This is Exception...");
	}
}
