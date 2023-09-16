package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.Container;
import com.spring.dao.PostDao;
import com.spring.dao.PostService;
import com.spring.dao.Student;
import com.spring.model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext an = 
				new AnnotationConfigApplicationContext(Container.class);
		/*Student s = an.getBean("student",Student.class);
		s.Data();*/
		PostDao p = an.getBean("postDaoImp",PostDao.class);
		User u = new User();
		p.allPosts(u);
		int r = 0;
		System.out.println(p.allLikes(u, r));
		p.fundao();
		p.setId();
		p.getId();
		
		PostService ps = an.getBean("postServiceImp",PostService.class);
		//ps.allPosts();
		System.out.println(ps.allPosts(u, r));
		System.out.println(ps.allLikes(u));
		ps.startservice();
		ps.setname();
		ps.getname();
	}

}
