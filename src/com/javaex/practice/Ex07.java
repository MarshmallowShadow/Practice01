package com.javaex.practice;

public class Ex07 {
	public static void main(String[] args) {
		int i = 10;
		int n = ++i % 2;
		
		System.out.println(i); //11
		System.out.println(n); //1 (i++ 후 i % 2)
	}
}
