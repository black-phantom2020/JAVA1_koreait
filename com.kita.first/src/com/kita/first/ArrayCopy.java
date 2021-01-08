package com.kita.first;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 6, 8};
		int[] arr2 = arr1;
		System.out.println("arr1: " + arr1);
		System.out.println("arr2: " + arr2);
		
		arr2 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("arr1: " + arr1);
		System.out.println("arr2: " + arr2);
		for(int n : arr2) {
			System.out.print(n+", ");
		}
		
	}
}
