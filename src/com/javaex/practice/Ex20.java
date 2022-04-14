package com.javaex.practice;
import java.util.*;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amt;
		
		System.out.print("500원 개수: ");
		int h5 = sc.nextInt();
		System.out.print("100원 개수: ");
		int h1 = sc.nextInt();
		System.out.print("50원 개수: ");
		int t5 = sc.nextInt();
		System.out.print("10원 개수: ");
		int t1 = sc.nextInt();
		
		amt = (500 * h5) + (100 * h1) + (50 * t5) + (10 * t1);
		System.out.println("동전의 총합은 " + amt + "원 입니다.");
		
		sc.close();
	}
}
