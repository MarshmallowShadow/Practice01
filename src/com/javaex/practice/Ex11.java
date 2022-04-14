package com.javaex.practice;
import java.util.*;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int savings;
		
		System.out.print("월급을 입력하세요: ");
		
		try {
			
			int salary = sc.nextInt();
			
			savings = salary * 120;
			
			System.out.println("10년동안 최대 저축엑은 " + savings + "원 입니다.");
			
		} catch(Exception e) {
			
			System.out.println("오류: 다시 시도하세요");
			
		}
		
		sc.close();
	}
}
