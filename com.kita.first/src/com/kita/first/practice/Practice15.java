package com.kita.first.practice;

public class Practice15 {
	public static void main(String[] args) {
		// *****
		// *****
		// *****
		// *****
		// *****
//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
		
		int star = 5;
		
		for(int i=1; i<=star; i++) {
			for(int z=1; z<=star; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		for(int i=1; i<=star*star; i++) {
			System.out.print("*");
			if(i%star==0) {
				System.out.println();
			}
		}
		
		
		
		
		
		
	}
}
