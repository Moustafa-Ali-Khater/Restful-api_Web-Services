package com.spring.pack;

import org.springframework.stereotype.Component;

@Component
public class AcessDataBase {

	/*public String getstudent() {
		throw new RuntimeException("Exception");
		//return "The name of Student is Mostafa Khater";
	}*/
	
	public void getstudent() {
		System.out.println("Student");
		throw new RuntimeException("Exception");
	}
}
