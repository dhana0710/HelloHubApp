package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	//Query method
	//SpringData help to create and hibernate help to execute
	Optional<Post> findByUrl(String url);

}
 