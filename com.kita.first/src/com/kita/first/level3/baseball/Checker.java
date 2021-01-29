package com.kita.first.level3.baseball;

public class Checker {
// 스트라이크, 볼, 아웃 개수 확인하는 클래스
	public static boolean check(int gameCnt, Baseball ball, MyBall myBall) {
		int s=0;
		int b=0;
		
		for(int i=0; i<gameCnt; i++) {
			for(int z=0; z<gameCnt; z++) {
				if(ball.getRNum(i) == myBall.getMyNum(z)) {
					if(i==z) {
						s++;
					} else {
						b++;
					}
				}
			}
		}
		System.out.printf("S: %d, B: %d, O: %d\n", s, b, gameCnt-s-b);
		// (s!=gameCnt) // false
		
//		boolean result = (s != gameCnt);
//		return result;
		return (s != gameCnt);
	}
}












