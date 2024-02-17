package com.example.demo.service.Impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PostDto;
import com.example.demo.mapper.PostMapper;
import com.example.demo.repository.PostRepository;
import com.example.demo.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	public PostRepository postRepository;
	
	@Autowired
	public PostServiceImpl(PostRepository postRepository) {
		this.postRepository=postRepository;
	}

	@Override
	public List<PostDto> findAllPosts() {
		List<PostDto> postDto=postRepository.findAll().stream().map((post)->PostMapper.mapToPostDto(post)).collect(Collectors.toList());
		 return postDto;
	}
	
	

}
