package com.exam.controller;

import java.time.LocalDateTime;

import com.exam.board.model.Board;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class BoardDto {
	private Integer id;
	private String title;
	private String content;
	 private String auth;
	private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    public BoardDto toEntity() {
        BoardDto build = Board.builder()
                .id(id)
                .title(title)
                .auth(auth)
                .content(content)
                .build();
        return build;
        
    }
    @Builder
    public BoardDto(Integer id, String auth, String title, String content, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.auth = auth;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
