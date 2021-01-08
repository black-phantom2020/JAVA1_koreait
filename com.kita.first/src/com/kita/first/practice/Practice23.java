package com.kita.first.practice;

public class Practice23 {
	public static void main(String[] args) {
		int[] arr = {34, 67, 2, 11, 6, 90};
		int temp;
		// 순차정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int z=i+1; z<arr.length; z++) {
				if(arr[i]<arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
		
		for(int n : arr) {
			System.out.print(n + ", ");
		}
	}
}
