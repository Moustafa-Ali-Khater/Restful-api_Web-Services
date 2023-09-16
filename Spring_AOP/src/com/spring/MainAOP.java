package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.Container;
import com.spring.pack.AcessDataBase;
import com.spring.pack.Person;

public class MainAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext an = 
				new AnnotationConfigApplicationContext(Container.class);
	
		/*Person p = an.getBean("myPerson", Person.class);
		p.getdata();*/
		
		AcessDataBase a = an.getBean("acessDataBase", AcessDataBase.class);
		//System.out.println(a.getstudent());
		a.getstudent();
	}

}
