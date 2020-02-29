package com.forgyan.logic;

public class FactorialWithRecurssion {
	static int sum = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}
	public static void print(int n) {
		int num = n;
		sum = sum*n;
		if(n>1) {
			num--;
			print(num);
		}else {
			System.out.println(sum);
		}
	}

}
