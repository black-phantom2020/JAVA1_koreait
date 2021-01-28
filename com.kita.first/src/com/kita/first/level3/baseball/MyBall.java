package com.kita.first.level3.baseball;

import java.util.Scanner;

public class MyBall {
// 내가 숫자값 입력하고 예외 처리하는 클래스
	// 필드
	private int[] myArr;
	private Scanner scan;
	
	// 생성자
	public MyBall(int gameCnt) {
		init(gameCnt);
	}
	
	//메소드
	private void init(int gameCnt) {
		myArr = new int[gameCnt];
		scan = new Scanner(System.in);
	}
	
	setNumber() {}
	
	getMyNum(int idx) {}
	
}










