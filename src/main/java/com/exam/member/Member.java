package com.exam.member;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class Member {
	@Id
	private String id;
	private String password;
	private String name;
	private String role;
}
