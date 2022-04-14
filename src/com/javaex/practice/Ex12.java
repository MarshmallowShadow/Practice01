package com.javaex.practice;
import java.util.*;
import java.lang.Math;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area;
		
		System.out.print("반지름을 입력하세요: ");
		double radius = sc.nextDouble();
		
		sc.nextLine();
		
		area = 3.14 * Math.pow(radius, 2);
		
		System.out.println("원의 넓이는 " + area);
		
		sc.close();
	}
}
