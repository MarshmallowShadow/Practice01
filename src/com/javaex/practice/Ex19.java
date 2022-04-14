package com.javaex.practice;

public class Ex19 {
	public static void main(String[] args) {
		long speed = 300000;
		long sec = 60 * 60 * 24 *365;
		long d = sec * speed;
		
		System.out.println("빛이 1년동안 가는 거리는 " + d + "km 입니다.");
	}
}
