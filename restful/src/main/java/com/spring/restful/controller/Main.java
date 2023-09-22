package com.spring.restful.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.exception.StudentException;
import com.spring.restful.model.Student;
import com.spring.restful.model.StudentError;

@RestController
@RequestMapping("/main")
public class Main {

	@GetMapping("/facebook")
	public String getmain() {
		return "Hallo!..";
	}
	
	private List<Student> li = new ArrayList<Student>();
	
	@PostConstruct
	public void start() {
		Student s = new Student(1, "mostafa", "01226587457");
		Student s1 = new Student(2, "mohamed", "01527787457");
		Student s2 = new Student(3, "mahmoud", "01047387457");
		Student s3 = new Student(4, "samy", "01195187457");
		Student s4 = new Student(5, "ali", "01033387457");
		li.add(s); li.add(s1); li.add(s2); li.add(s3); li.add(s4);
	}
	
	@GetMapping("student")
	public List<Student> getstudent(){
		return li;
	}
	
	@GetMapping("getstudent/{id}")
	public Student getstudentById(@PathVariable("id") int id) {
		if (id < 0 || id >= li.size()) {
			throw new StudentException("Sudent not Found " + "ID: " + id);
		}
		return li.get(id - 1);
	}
	
	@GetMapping("getstudentid")
	public Student getstudentId(@RequestParam int id) {
		if (id < 0 || id >= li.size()) {
			throw new StudentException("Sudent not Found " + "ID: " + id);
		}
		return li.get(id - 1);
	}
	
	/*@ExceptionHandler
	public ResponseEntity<StudentError> getEx(StudentException se) {
		StudentError s = new StudentError();
		s.setStatuscode(HttpStatus.NOT_FOUND.value());
		s.setMessage(se.getMessage());
		s.setTimestap(System.currentTimeMillis());
		return new ResponseEntity<StudentError>(s, HttpStatus.NOT_FOUND);
	}*/
}