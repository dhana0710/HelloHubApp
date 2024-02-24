package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	//Query method
	//SpringData help to create and hibernate help to execute
	Optional<Post> findByUrl(String url);
	
	//JPQL- It is same as SQL but it go against ENTITY to r,s in DB
	@Query("SELECT p from Post p WHERE "+
			" p.title LIKE CONCAT('%',:name,'%') OR "+
			" p.shortDescription LIKE CONCAT('%',:name,'%')")
	List<Post> searchPost(@Param("name") String name);

}
 