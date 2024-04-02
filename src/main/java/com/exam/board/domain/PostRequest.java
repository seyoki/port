package com.exam.board.domain;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {
	private Long id; //pk
	private String title; //title
	private String content; 
	private String writer;
	private Boolean noticeYn; //공지글여부
	private List<MultipartFile> files=new ArrayList<>();
}
