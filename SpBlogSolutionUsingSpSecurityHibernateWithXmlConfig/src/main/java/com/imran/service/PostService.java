package com.imran.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.imran.common.BaseService;
import com.imran.dao.PostDao;
import com.imran.model.Post;

@Service
public class PostService extends BaseService{
	
	@Autowired
	PostDao postDao;
	
	

	@Autowired
	private SessionFactory sessionFactory;
	
	public void testMethod(){
		System.out.println("Session data:"+sessionFactory.getClass());
		System.out.println("Session dddmmm:"+sessionFactory.getAllClassMetadata());
	
	}
	
	
    public void createOrUpdatePost(Post post){
    	postDao.addProduct(post);
    }
	
	public void updateProduct(Post post){
		postDao.updateProduct(post);
	}
	
	public List<Post> postList(){
		return postDao.listProduct();
	}
	
	public Post findByPostId(long postId){
		return postDao.getProductById(postId);
	}
	
	public void removeProduct(long postId){
		postDao.removeProduct(postId);
	}

}
