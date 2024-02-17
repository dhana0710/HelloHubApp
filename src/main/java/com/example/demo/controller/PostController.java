package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.dto.PostDto;
import com.example.demo.service.PostService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
	
	public PostService postService;
	
	@Autowired
	public PostController(PostService postService) {
		super();
		this.postService = postService;
	}
	
	//create handler method, GET request and return Model(ui) and View
	@GetMapping("/admin/posts")
	public String Posts(Model model) {
		List<PostDto> posts=postService.findAllPosts();
		model.addAttribute("posts", posts);
		return "admin/posts";
	}
	
	

}
