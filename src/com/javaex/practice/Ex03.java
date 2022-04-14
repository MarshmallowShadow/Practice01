package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x * 2;
		int b = y++ * 2;
		
		System.out.println("a = " + a); //4 (++x 먼저 그 다음에 * 2)
		System.out.println("b = " + b); //2 (*2 먼저 그 다음에 ++y)
		System.out.println("x = " + x); //2
		System.out.println("y = " + y); //2
	}
}
