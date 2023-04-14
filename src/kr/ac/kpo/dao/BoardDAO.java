package kr.ac.kpo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kpo.vo.BoardVO;

public class BoardDAO {
	
	private List<BoardVO> boardList;

	public BoardDAO() {
		boardList = new ArrayList<>();
	}
	
	public void insertBoard(BoardVO board) {
		boardList.add(board);
	}
	
	

}
