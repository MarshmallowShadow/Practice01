package com.javaex.practice;
import java.util.*;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c;
		
		System.out.print("화씨: ");
		double f = sc.nextDouble();
		
		c = ((double)5/(double)9) * (f - 32);
		
		System.out.println("화씨 " + f + "의 썹씨온도는 " + c + " 입니다.");
		
		sc.close();
		 
	}
}
