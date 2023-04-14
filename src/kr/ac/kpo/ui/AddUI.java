package kr.ac.kpo.ui;

import kr.ac.kpo.dao.BoardDAO;
import kr.ac.kpo.vo.BoardVO;

public class AddUI extends BaseUI{
	
	private BoardDAO boardDao;
	
	public AddUI() {
		boardDao = new BoardDAO();
	}

	@Override
	public void execute() throws Exception {

		String title = scanStr("등록할 제목을 입력하세요 : ");
		String writer = scanStr("글쓴이를 입력하세요 : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title); //setter
		board.setWriter(writer);
		
		boardDao.insertBoard(board);
		
		System.out.println("새글 등록을 완료하였습니다");
	}
	
	

}
