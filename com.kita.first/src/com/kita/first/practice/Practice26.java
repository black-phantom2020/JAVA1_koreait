package com.kita.first.practice;

public class Practice26 {
	public static void main(String[] args) {
		// 1~9 <- 랜덤으로 겹치지 않게 배열에 초기화시키기
		
		int len = 9;
		int[] arr = new int[len];
		
		int max = 9;
		int min = 1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * (max-min+1)+min);
			for(int z=0; z<i; z++) {
				if(arr[i]==arr[z]) {
					i--;
					break;
				}
			}
		}
		
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
