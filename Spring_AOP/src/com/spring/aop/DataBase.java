package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBase {

	@Pointcut("execution(public * com.spring.dao.*.*(..))")
	public void PointCut() {
		
	}
	
	@Pointcut("PointCut() && !(Setter() || Getter())")
	public void FPointCut() {
			
		}
	
	//@Before("execution(public void allPosts())")
	//@Before("execution(public void com.spring.dao.PostDao.allPosts())")
	//@Before("execution(public void com.spring.dao.PostDaoImp.allPosts())")
	//@Before("execution(public * allPosts())")
	//@Before("execution(public * all*())")
	//@Before("execution(public * all*(com.spring.model.User))")
	//@Before("execution(public * all*(com.spring.model.User, ..))")
	//@Before("execution(public * all*(..))")
	//@Before("execution(public * all*(*))")
	//@Before("execution(public * com.spring.dao.*.*(..))")
	//@Before("PointCut()")
	//@Before("PointCut() && !(Setter() || Getter())")
	@Before("FPointCut()")
	public void connectionDB() {
		System.out.println("Connected to DataBase Successfully!");
	}
	
	//@Before("execution(public * com.spring.dao.*.*(..))")
	//@Before("PointCut()")
	//@Before("PointCut() && !(Setter() || Getter())")
	@Before("FPointCut()")
	public void LogIn() {
		System.out.println("Successfully LognIn!");
	}
	
	@Pointcut("execution(public * com.spring.dao.*.set*())")
	public void Setter() {
		
	}
	
	@Pointcut("execution(public * com.spring.dao.*.get*())")
	public void Getter() {
		
	}
}
