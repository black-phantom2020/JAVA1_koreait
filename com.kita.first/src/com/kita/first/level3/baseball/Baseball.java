package com.kita.first.level3.baseball;

public class Baseball {
// 컴퓨터가 랜덤으로 숫자 뽑는 클래스
	// 필드
	private int[] rArr;
	
	// 생성자
	public Baseball(int gameCnt) {
		init(gameCnt);
	}

	private void init(int gameCnt) {
		rArr = new int[gameCnt];
		setRandom();
	}
	
	// 메소드
	public int getRNum(int idx) {
		return rArr[idx];
	}
	
	private void setRandom() {
		int max = 9;
		int min = 1;
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * (max - min + 1) + min);
			for(int z=0; z<i; z++) {
				if(rArr[z] == rArr[i]) {
					i--;
					break;
				}
			}
		}
	}
}











