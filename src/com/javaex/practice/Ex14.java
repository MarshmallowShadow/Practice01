package com.javaex.practice;
import java.util.*;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area;
		double perimeter;
		
		System.out.print("가로로 입력하세요: ");
		double width = sc.nextDouble();
		System.out.print("세로로 입력하세요: ");
		double height = sc.nextDouble();
		
		area = width * height;
		perimeter = (2 * width) + (2 * height);
		
		System.out.println("사각형 넓이는 " + area);
		System.out.println("사각형 둘레는 " + perimeter);
		
		sc.close();
	}
}
