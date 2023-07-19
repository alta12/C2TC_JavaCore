package com.cg.day2;

public class RelationalOperators {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(a>b & a>c) {
			System.out.println("a is great");
		}
		else if(b>c) {
			System.out.println("b is great");
		}
		else {
			System.out.println("c is great");
		}
	}
}
