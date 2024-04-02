package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.exam.board.model.Board;
import com.exam.controller.PostResponse;
import com.exam.rep.BoardRepository;


@Service
public  class BoardService{
	@Autowired
	private BoardRepository boardRepository;
	public void write(Board board) {
		
		boardRepository.save(board);
	}
	
	//게시글리스트처리
    public List<Board> boardList(){
        //findAll : 테스트보드라는 클래스가 담긴 List를 반환하는것을 확인할수있다
        return boardRepository.findAll();
    }
    /*상세페이지3*/
    //특정 게시글 불러오기
    public Board boardview(Integer id){
        return boardRepository.findById(id).get(); //어떤게시글을 불러올지 지정을해주어야한다 (Integer값으로)
    }
    //글삭제
    public void boardDelete(Integer id) {
    	boardRepository.deleteById(id);
    }
	public void write(Board boardTemp, MultipartFile file) {
		// TODO Auto-generated method stub
		
	}
	public Page<Board> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	public Board findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void save(Board board) {
		// TODO Auto-generated method stub
		
	}
	public void deletePost(Integer id) {
		// TODO Auto-generated method stub
		
	}
	public List<PostResponse> findAllPost() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
