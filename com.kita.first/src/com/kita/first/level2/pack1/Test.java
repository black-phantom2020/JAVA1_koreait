package com.kita.first.level2.pack1;

import com.kita.first.level2.pack2.*;

public class Test {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 5;
		int n3 = 7;
		FinalStatic fs1 = new FinalStatic(n1, 1);
		FinalStatic fs2 = new FinalStatic(n2, 1);
		FinalStatic fs3 = new FinalStatic(n3, 1);
		
		System.out.println(fs1.N1);
		System.out.println(fs2.N1);
		System.out.println(fs3.N1);
		System.out.println();
		System.out.println(fs1.N2);
		System.out.println(fs2.N2);
		System.out.println(fs3.N2);
		
//		Singleton singleton = Singleton.getInstance();
		FinalStatic fs = new FinalStatic(1, 2);
		fs.printNum(1);
		
//		Scanner sc = new Scanner(System.in);
		
		Class1 c1 = new Class1(1, 2);
//		System.out.println(c1.n1);
		System.out.println(c1.n2);
//		com.kita.first.level2.pack2.Class1 c2 = new com.kita.first.level2.pack2.Class1();
		
		
		
		
		
	}
}
