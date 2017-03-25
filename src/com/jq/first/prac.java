package com.jq.first;

/**
 * 三元运算符
 */
public class prac {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		String result = a < b?"小于":"大于";
		int r = a < b?a:b;
		
		System.out.println(result);
		System.out.println(a);
	}
}
