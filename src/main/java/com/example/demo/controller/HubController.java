package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.PostDto;
import com.example.demo.service.PostService;

@Controller
public class HubController {
	
	private PostService postService;
	
	@Autowired
	public HubController(PostService postService) {
		this.postService=postService;
	}
	
	//handler method to handle http:://localhost:8080/
	@GetMapping("/")
	public String viewHubPosts(Model model) {
		List<PostDto> postsDtos=postService.findAllPosts();
		model.addAttribute("postsResponse", postsDtos);
		return "hub/view_posts";
	}
	
	
	
	@GetMapping("/post/{postUrl}")
	private String showPost(@PathVariable("postUrl") String postUrl,Model model) {
		PostDto postDto=postService.findPostByUrl(postUrl);
		model.addAttribute("post", postDto);
		return "hub/hub_post";
	}
	
	
	@GetMapping("/page/search")
	public String searchPost(@RequestParam(value="query") String query,Model model) {
		List<PostDto> postDtos=postService.searchPost(query);
		model.addAttribute("postsResponse", postDtos);
		return "hub/view_posts";
		
	}
	
	
	
	
	
	

}
