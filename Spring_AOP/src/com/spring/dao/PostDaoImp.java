package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostDaoImp implements PostDao{

	private int id;
	
	@Override
	public void allPosts(User user) {
		// TODO Auto-generated method stub
		System.out.println("PostDao... PostDao");
	}

	@Override
	public String allLikes(User user, int result) {
		// TODO Auto-generated method stub
		return "PostDao...Likes";
	}

	@Override
	public void fundao() {
		// TODO Auto-generated method stub
		System.out.println("PostDao... FunDao");
	}

	@Override
	public void setId() {
		// TODO Auto-generated method stub
		System.out.println("This is set Id");
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		System.out.println("This is get Id");
		return 0;
	}

}
