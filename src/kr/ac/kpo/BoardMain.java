package kr.ac.kpo;

import kr.ac.kpo.ui.BoardUI;

public class BoardMain {
	
	public static void main(String[] args) {
		
		try {
			new BoardUI().execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
