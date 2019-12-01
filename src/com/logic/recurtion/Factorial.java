package com.logic.recurtion;

public class Factorial {
	static int result =1;
	public static void main(String[] args) {
		printFactorial(2);
	}
	public static void printFactorial(int n) {
		
		if(n>=1) {
			result = result*n;
			printFactorial(n-1);
		}else {
			System.out.println(result);
		}

	}
}
