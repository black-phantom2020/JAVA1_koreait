package com.kita.first.level3.baseball;

public class Game {
// 실제 게임 실행하는 실행 클래스
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		do {
			myBall.setNumbers();
		} while(Checker.check(gameCnt, ball, myBall));
		
		System.out.println("야구게임 종료!");
	}
}




