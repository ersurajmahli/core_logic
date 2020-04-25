package com.forgyan.overloading;

public class OverloadingExampleOne {

	public static void main(String[] args) {
		OverloadingExampleOne obj = new OverloadingExampleOne();
		obj.methodOne("s");
	}
	
	public void methodOne(String s) {
		System.out.println("String called");
	}
	
	public void methodOne(long i) { 
		System.out.println("long called"); 
	}
	 
	public void methodOne(float i) {
		System.out.println("Float called");
	}
	
	public void methodOne(double i) {
		System.out.println("Double called");
	}
	
	public void methodOne(StringBuffer i) {
		System.out.println("StringBuffer called");
	}
	
	public static void methodOne(StringBuilder i) {
		System.out.println("StringBuffer called");
	}

}
