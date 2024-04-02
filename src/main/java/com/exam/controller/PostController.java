package com.exam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.board.domain.PostRequest;
import com.exam.service.PostService;

import lombok.RequiredArgsConstructor;
@Controller
@RequiredArgsConstructor
public class PostController {
	  private final PostService postService;
	//게시글 작성페이지
	    // 게시글 작성 페이지
	    @GetMapping("/post/write")
	    public String openPostWrite(@RequestParam(value = "id", required = false) final Long id, Model model) {
	        if (id != null) {
	            PostResponse post = postService.findPostById(id);
	            model.addAttribute("post", post);
	        }
	        return "post/write";
	    }
	    
	    @PostMapping("/post/save")
	    public String savePost(final PostRequest params) {
	    	postService.savePost(params);
	    	return "redirect:/post/list";
	    }
	    // 게시글 상세 페이지
	    @GetMapping("/post/view")
	    public String openPostView(@RequestParam (value="id",required=false)final Long id, Model model) {
	        PostResponse post = postService.findPostById(id);
	        model.addAttribute("post", post);
	        return "post/view";
	    }
	    // 기존 게시글 수정
	    @PostMapping("/post/update.do")
	    public String updatePost(final PostRequest params) {
	        postService.updatePost(params);
	        return "redirect:/post/list";
	    }
	    @GetMapping("/post/delete")
	    public String delete() {
	    	return "";
	    }
	    // 게시글 삭제
	    @PostMapping("/post/delete")
	    public String deletePost(@RequestParam final Long id) {
	        postService.deletePost(id);
	        return "redirect:/post/list";
	    }
}
