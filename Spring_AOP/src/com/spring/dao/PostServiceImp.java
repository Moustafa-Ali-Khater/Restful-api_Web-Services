package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostServiceImp implements PostService{

	private String name;
	
	/*@Override
	public void allPosts() {
		// TODO Auto-generated method stub
		System.out.println("My Posts... PostService");
	}*/
	
	@Override
	public String allPosts(User user, int result) {
		// TODO Auto-generated method stub
		return "PostDao... PostService";
	}

	@Override
	public String allLikes(User user) {
		// TODO Auto-generated method stub
		return "PostDao...LikesService";
	}

	@Override
	public void startservice() {
		// TODO Auto-generated method stub
		System.out.println("PostDao... Start Service");
	}

	@Override
	public void setname() {
		// TODO Auto-generated method stub
		System.out.println("This is set Name");
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		System.out.println("This is get Name");
		return null;
	}

}
