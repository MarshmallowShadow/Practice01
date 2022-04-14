package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double volume;
		
		System.out.print("반지름을 입력하세요: ");
		double radius = sc.nextDouble();
		
		volume = (4.0/3.0) * (3.14 * Math.pow(radius, 3));
		
		System.out.println("구의 부피는 " + volume);
		
		sc.close();
	}
}
