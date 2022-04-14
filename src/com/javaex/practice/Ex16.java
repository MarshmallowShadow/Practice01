package com.javaex.practice;
import java.util.*;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tax;
		double change;
		
		System.out.print("상품가격: ");
		double price = sc.nextDouble();
		System.out.print("받은돈: ");
		double pay = sc.nextDouble();
		tax = price / 10.0;
		change = pay - price;
		
		System.out.println("===============");
		System.out.println("받은돈: " + price);
		System.out.println("상품가격: " + pay);
		System.out.println("부가세: " + tax);
		System.out.println("잔엑: " + change);
		
		sc.close();
	}
}
