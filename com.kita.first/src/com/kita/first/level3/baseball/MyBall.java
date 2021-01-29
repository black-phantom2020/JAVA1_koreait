package com.kita.first.level3.baseball;

import java.util.Arrays;
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
	
	// 숫자를 입력받는 기능
	public void setNumbers() {
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("%d번째 숫자: ", i+1);
			String val = scan.next();
			try {
				myArr[i] = Integer.parseInt(val);
			} catch(Exception e) {
				i--;
				System.out.println("1~9까지의 숫자값을 입력해주세요.");
				continue;
			}
			
			for(int z=0; z<i; z++) {
				if(myArr[z]==myArr[i]) {
					i--;
					System.out.println("중복된 값이 존재합니다.");
					break;
				}
			}
		}
		System.out.println(Arrays.toString(myArr));
	}
	
	public int getMyNum(int idx) {
		return myArr[idx];
	}
	
}










