package com.exam.rep;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.board.model.Board;
import com.exam.controller.BoardDto;

@Repository                     //어떤엔티티를 넣을것이냐, 엔티티의 id의 타입
public interface BoardRepository extends JpaRepository<Board, Integer> {

	Board save(BoardDto entity);


}