package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PostDto;

public interface PostService {
	
	List<PostDto> findAllPosts();

}