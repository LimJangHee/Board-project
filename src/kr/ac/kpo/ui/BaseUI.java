package kr.ac.kpo.ui;

import java.util.Scanner;

public abstract class BaseUI implements IBoardUI { // IBoardUI 인터페이스를 상속받았지만 인테페이스 내 메소드 구현을 안했기 때문에 abstract로
												// 모든 UI에 BaseUI를 상속시키셔 편하게 관리하기 위해 implements를 여기다 해줌
	private Scanner sc;
	
	public BaseUI() {
		sc = new Scanner(System.in);
	}
	
	protected int scanInt(String msg) {
		System.out.print(msg);
		
		int num = Integer.parseInt(sc.nextLine());//문자열로 입력받아서 정서형으로 전환
		return num;
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

}
