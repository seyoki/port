package com.exam.board.model;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.exam.controller.BoardDto.BoardDtoBuilder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class) /* JPA에게 해당 Entity는 Auditiong 기능을 사용함을 알립니다. */
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 10, nullable = false)
	    private String author;
	@CreatedDate
	@Column(updatable=false)
	private LocalDateTime createdDate;
	 @LastModifiedDate
	    private LocalDateTime modifiedDate;

	private Long seq;
    private String title;
    private String writer;
	    private String content;
	    private Date createDate;
	    private long cnt;
	   
	    public Board(Integer id, String author, String title, String content) {
	        this.id = id;
	        this.author = author;
	        this.title = title;
	        this.content = content;
	    }

		public void setTitle(String title2) {
			// TODO Auto-generated method stub
			
		}

		public void setContent(String content2) {
			// TODO Auto-generated method stub
			
		}

		public static BoardDtoBuilder builder() {
			// TODO Auto-generated method stub
			return null;
		}
}
