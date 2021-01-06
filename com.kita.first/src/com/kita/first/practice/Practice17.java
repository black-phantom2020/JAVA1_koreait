package com.kita.first.practice;

public class Practice17 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		
//		int star = 4;
//		
//		for(int i=1; i<=star; i++) {
//			for(int z=1; z<=i; z++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
		
		
		int star = 4;
		int line = 1;
		int st = 0;
		
		for(int i=1; i<=star*star; i++) {
			System.out.print("*");
			st++;
			if(st==line) {
				System.out.println();
				line++;
				st = 0;
			}
			if(line > star) {
				break;
			}
		}
		
		
		
		for(int i = 1, j = 1; i <= star*(star + 1) / 2; i++) {
			System.out.print("*");
			if (i == j * (j + 1) / 2) {
				System.out.println();
				j++;
			}
		}
		
		
		
		
		


		
		for(int i=1; i<=star; i++) {
			for(int z=star; z>0; z--) {
				System.out.print(i<z ? "" : "*");
				/*
				if(i<z) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
				*/
			}
			System.out.println();
		}
		
		
		
		
		
		
		//System.out.print(i<z ? "" : "*");	// (i<z ? " " : " *") 하면 피라미드 모양
		
		

	}
}
