package com.spring.dao;

import com.spring.model.User;

public interface PostService {

	//public void allPosts();
	public String allPosts(User user, int result);
	public String allLikes(User user);
	public void startservice();
	public void setname();
	public String getname();
}
