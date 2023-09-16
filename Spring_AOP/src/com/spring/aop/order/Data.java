package com.spring.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class Data {

	@Before("execution(public void getdata())")
	public void getdata() {
		System.out.println("Start");
	}
}
