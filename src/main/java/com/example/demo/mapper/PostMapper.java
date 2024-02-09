package com.example.demo.mapper;

import com.example.demo.dto.PostDto;
import com.example.demo.entity.Post;




public class PostMapper {
	
	
	//map Post entity to PostDto
	public static PostDto mapToPostDto(Post post) {
		return PostDto.builder()
				.id(post.getId())
				.title(post.getTitle())
				.url(post.getUrl())
				.content(post.getContent())
				.shortDescription(post.getShortDescription())
				.createdOn(post.getCreatedOn())
				.updateOn(post.getUpdateOn())
				.build();
	}
	//map PostDto to Post entity
	public static Post mapToPost(PostDto postDto) {
		Post post=Post.builder()
				.id(postDto.getId())
				.title(postDto.getTitle())
				.content(postDto.getContent())
				.url(postDto.getUrl())
				.shortDescription(postDto.getShortDescription())
				.createdOn(postDto.getCreatedOn())
				.updateOn(postDto.getUpdateOn())
				.build();
				
		return post;
		
	}

	
}


