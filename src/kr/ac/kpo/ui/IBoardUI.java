package kr.ac.kpo.ui;

public interface IBoardUI {// 모든 UI에 상속시켜서 execute라는 메소드 명으로 실행하게끔 강제성 부여
	
	void execute() throws Exception; //예외 처리를 외부에서 하라고 강제성을 부여, 호출시 try, catch

}
