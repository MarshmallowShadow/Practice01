package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {
		double f = 80.0;
		System.out.println(5/9*(f-32.0));
		//5와 9가 정수이며 정수로 계산해서 0이 나옴 (그 후에 (f-32.0)는 double이며 곱하면 double인 0.0아 나옴)
	}
}
