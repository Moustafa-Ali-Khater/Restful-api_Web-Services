package com.spring.pack;

import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {

	public void getdata() {
		System.out.println("I'm Person");
	}
}
