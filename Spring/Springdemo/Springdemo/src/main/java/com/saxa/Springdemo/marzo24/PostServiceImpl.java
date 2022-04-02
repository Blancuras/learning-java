package com.saxa.Springdemo.marzo24;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

	@Override
	public List<Post> validationId(List<Post> posts) {
		for(Post post : posts) {
			if(post.getTitulo()==null) {
				throw new NullPointerException("El titulo esta nulo");
			}
		}
		return posts;
	}


}
