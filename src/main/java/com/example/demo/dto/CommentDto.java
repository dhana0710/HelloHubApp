package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentDto{

	private Long id;

	private String name;

	private String email;
	private String content;
	private LocalDateTime createdOn;
	private LocalDateTime upDateOn;
	
}


