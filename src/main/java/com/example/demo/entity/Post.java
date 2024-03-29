package com.example.demo.entity;



import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
	private String url;
	
	@Lob
	@Column(nullable = false,columnDefinition = "LONGTEXT")
	private String content;
	
	
	private String shortDescription;
	
	@CreationTimestamp
	private LocalDateTime createdOn;
	@UpdateTimestamp
	private LocalDateTime updateOn;
	
	@OneToMany(mappedBy = "post",cascade = CascadeType.REMOVE)
	private Set<Comment> comments=new HashSet<>();
	//post with set
	
	
	
	
	
	

}
