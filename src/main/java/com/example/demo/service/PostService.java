package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PostDto;

public interface PostService {
	
	List<PostDto> findAllPosts();
	
	void createPost(PostDto postDto);
	
	PostDto findPostById(Long id);
	
	void updatePost(PostDto postDto);
	
	void deletePost(Long id);
	
	PostDto viewPost(String url);
	
	List<PostDto> searchPost(String name);

	PostDto findPostByUrl(String url);

	
}
