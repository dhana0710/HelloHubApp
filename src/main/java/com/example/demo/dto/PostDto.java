package com.example.demo.dto;



import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

	//It act as model between Controller layer to view layer
	// Becz of good format
	//Data transfer Object
	
	private Long id;
	@NotEmpty(message = "Post must have title")
	private String title;
	private String url;
	@NotEmpty(message = "Post must have content")
	private String content;
	@NotEmpty(message = "Post must have shortDescription")
	private String shortDescription;
	private LocalDateTime createdOn;
	private LocalDateTime updateOn;
	

}
