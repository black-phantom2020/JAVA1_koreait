package com.kita.first;

public class ArrayOrder1 {
	public static void main(String[] args) {
		int[] arr = {7, 1, 45, 0, 2};
		int temp;
		temp = arr[0]; // 7
		arr[0] = arr[1]; // 1
		arr[1] = temp;
		System.out.println("arr[0]: "+arr[0]);
		System.out.println("arr[1]: "+arr[1]);
		
		// {1, 7, 45, 0, 2}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int z=i+1; z<arr.length; z++) {
				if(arr[i]>arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num+", ");
		}
		
		
		
		
		
	}
}
