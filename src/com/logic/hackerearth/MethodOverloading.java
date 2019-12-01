package com.logic.hackerearth;

public class MethodOverloading {
	
	public void m1(Integer i) {
		System.out.println("Inside Integer");
	}
	public void m1(Long l) {
		System.out.println("Inside Long");
	}
	
	public static void m1(String s) {
		System.out.println("Inside String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.m1(5);

	}

}
