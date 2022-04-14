package com.javaex.practice;
import java.util.*;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dollar;
		
		System.out.print("환전할 원화를 입력하세요: ");
		double won = sc.nextDouble();
		
		dollar = won / 1230.95;
		
		System.out.println("받으실 달러는 " + dollar);
		
		sc.close();
	}
}
