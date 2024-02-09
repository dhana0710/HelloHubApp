package com.example.demo.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@Builder
public class PostDto {

	//It act as model between Controller layer to view layer
	// Becz of good format
	//Data transfer Object
	
	private Long id;
	private String title;
	private String url;
	private String content;
	private String shortDescription;
	private LocalDateTime createdOn;
	private LocalDateTime updateOn;
	

}
