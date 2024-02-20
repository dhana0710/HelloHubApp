package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.dto.PostDto;
import com.example.demo.service.PostService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	//field attribute us to store datas int object
	//handler method for newpost
	@GetMapping("/admin/posts/newpost")
	public String newPostForm(Model model) {
		PostDto postDto= new PostDto();
		model.addAttribute("post", postDto);
		return "admin/create_post";
	}
	
	//handler method for post submition
	@PostMapping("/admin/posts")
	public String createPost(@ModelAttribute PostDto postDto) {
		postDto.setUrl(getURL(postDto.getTitle()));
		this.postService.createPost(postDto);
		return "redirect:/admin/posts";
	}
	
	public static String getURL(String postTitle) {
		String title=postTitle.trim().toLowerCase();
		String url=title.replaceAll("\\s+", "-");
		url=url.replaceAll("[^A-Za-z0-9]","--");
		return url;
	}
	
	
	
	

}
