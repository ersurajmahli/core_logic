package com.forgyan.hackerearth;

public class ExceptionWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());

	}

	public static int m1() {
		try {
			return 1;
		}catch (Exception e) {
			return 2;
		}finally {
			return 3;
		}
	}
}
