package com.kita.first.practice;

public class Practice28 {
	public static void main(String[] args) {
//		국어합계: ?, 평균: ?   00.0
//	 	수학합계: ?, 평균: ?
//	 	영어합계: ?, 평균: ?
//	 	전체합계: ?, 평균: ?
		int[][] arr = {
				{90, 100, 88}, // 국어
				{34, 99, 45}, // 수학
				{89, 65, 74} // 영어
		};
		String[] clsArr = {"국어", "수학", "영어"};
		int[] sumArr = new int[clsArr.length]; // {0, 0, 0}
		// 각 과목의 성적 합해서 sumArr에 넣기
		// 각 과목 합계와 평균 출력하기
		
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				sumArr[i] += arr[i][z];
			}
			System.out.printf("%s합계: %d, 평균: %.1f\n", clsArr[i], sumArr[i], (float)sumArr[i]/arr[i].length);
		}
		
		int totalSum = 0;
		int totalCnt = 0;
		for(int i=0; i<sumArr.length; i++) {
			totalSum += sumArr[i];
			totalCnt += arr[i].length;
		}
		System.out.printf("전체합계: %d, 평균: %.1f\n", totalSum, (float)totalSum/totalCnt);
		
		
		
	}
}
