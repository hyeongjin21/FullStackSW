package com.smhrd.model;

import lombok.Data;
import lombok.NonNull;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Member {

   // DTO : Data Transfer object
   
   // VO : Value object
   
   // 필드(속성) 
	@NonNull
	private String id;
	@NonNull
	private String pw;
	private String name;
   
   
}
