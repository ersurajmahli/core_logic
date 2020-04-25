package com.forgyan.logic;

public class CheckProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Parent p = new Child(); p.m1();
		 */
		Parent p = new Parent();
		Child c = new Child();
		p=c;
		p.m1();
		//p.m2();
	}

}

class Parent{
	public void m1() {
		System.out.println("Hello Parent");
	}
}

class Child extends Parent{
	public void m1() {
		System.out.println("Hello Child");
	}
	
	public void m2() {
		System.out.println("Hello Child m2");
	}
}