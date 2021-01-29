package com.kita.first.level4;

import java.util.Scanner;

public class ThrowsException {
	Scanner scan = new Scanner(System.in);
	
	void method1() throws Exception {
		int num = Integer.parseInt(scan.next());
	}
}
